package com.example.gymhelper

import android.Manifest
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.app.ActivityCompat
import androidx.core.content.PermissionChecker
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.gymhelper.databinding.ActivityMainBinding
import com.example.gymhelper.db.*
import kotlinx.coroutines.*
import java.io.*

class MainActivity : AppCompatActivity() {

    lateinit var db: ExcersizeDatabase

    private val job = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + job)

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        if(ActivityCompat.checkSelfPermission(applicationContext,
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE) != PermissionChecker.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(this, arrayOf( Manifest.permission.WRITE_EXTERNAL_STORAGE), 1)
        }

        setupNavigation()

        db = ExcersizeDatabase.getInstance(application)

      /*  uiScope.launch {
            withContext(Dispatchers.IO) {
                ExcersizeDatabase.prefillDb(applicationContext, db)
               // db.trainingProgramsExcercizesDao.insert(TrainingProgramsExcersizes(trainingProgramId = 1, excersizeId = 1, DayName = "День 1"))
            }
        }*/

    }

    override fun onSupportNavigateUp() = navigateUp(findNavController(R.id.nav_host_fragment), binding.drawerLayout)


    private fun setupNavigation() {

        val navController = findNavController(R.id.nav_host_fragment)

        setupActionBarWithNavController(navController, binding.drawerLayout)

        binding.navigationView.setupWithNavController(navController)

    }


}
