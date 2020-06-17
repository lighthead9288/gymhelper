package com.example.gymhelper.db

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.gymhelper.R
import java.io.*

@Database(entities = [Excersize::class, Photo::class, ExcersizePhoto::class, TrainingProgram::class, TrainingProgramsExcersizes::class, TrainingProgramDay::class,
    TrainingProfile::class, TrainingProfileExcersize::class], version = 11)
abstract class ExcersizeDatabase: RoomDatabase() {

    abstract val excersizeDao:ExcersizeDao

    abstract val photoDao: PhotoDao

    abstract val excercizePhotoDao: ExcercizePhotoDao

    abstract val trainingProgramDao: TrainingProgramDao

    abstract val trainingProgramsExcercizesDao: TrainingProgramsExcercizesDao

    abstract val trainingProgramDayDao: TrainingProgramDayDao

    abstract val trainingProfileDao: TrainingProfileDao

    abstract val trainingProfilesExcersizesDao: TrainingProfilesExcersizesDao

    companion object {

        @Volatile
        private var INSTANCE: ExcersizeDatabase? = null

        fun getInstance(context: Context): ExcersizeDatabase {

            synchronized(this) {

                var instance = INSTANCE

                if (instance==null) {

                    instance = Room.databaseBuilder(context.applicationContext, ExcersizeDatabase::class.java, "ExcersizeDatabase")
                        .addCallback(object: Callback() {
                            override fun onCreate(db: SupportSQLiteDatabase) {
                                super.onCreate(db)
                                Thread(Runnable { prefillDb(context, getInstance(context)) }).start()
                            }
                        })
                        .fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance

                }


                return instance
            }
        }

        fun prefillDb(context: Context, db: ExcersizeDatabase) {
            val v = db.trainingProgramDao.getAll()
            var progId = db.trainingProgramDao.insert(TrainingProgram(Name = "Основная"))

            val zhimLezhaId = fillSingleExcersizeInfo(context, db, Excersize(Name="Жим лежа", Description = context.getString(R.string.zhimLezhaDescription),
                Group = "Грудь", Subgroup = "", Level = "Сложный"), mutableListOf(R.drawable.zhim_sht_shir_hv1, R.drawable.zhim_sht_shir_hv2))
            val shimNaklId = fillSingleExcersizeInfo(context, db, Excersize(Name="Жим штанги лежа на наклонной скамье", Description = context.getString(R.string.zhimLezhaNaklSkDescription),
                Group = "Грудь", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.zhim_sht_lezha_nakl_sk1, R.drawable.zhim_sht_lezha_nakl_sk2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Жим гантелей лежа", Description = context.getString(R.string.zhimLezhaGantDescription),
                Group = "Грудь", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.zhim_gant_lezha1, R.drawable.zhim_gant_lezha2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Жим в рычажном тренажере", Description = context.getString(R.string.zhimRychazhTrenDescription),
                Group = "Грудь", Subgroup = "", Level = "Легкий"), mutableListOf(R.drawable.zhim_sidya_v_rychazh_tren1, R.drawable.zhim_sidya_v_rychazh_tren2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Жим штанги головой вниз", Description = context.getString(R.string.zhimGolovoiVnizDescription),
                Group = "Грудь", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.zhim_golovoi_vniz1, R.drawable.zhim_golovoi_vniz2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Отжимания в петлях", Description = context.getString(R.string.otzhimVPetlyahDescription),
                Group = "Грудь", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.otzhim_v_petlyah1, R.drawable.otzhim_v_petlyah2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Отжимания на брусьях", Description = context.getString(R.string.otzhimNaBrusDescription),
                Group = "Грудь", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.otzhim_brus_grud1, R.drawable.otzhim_brus_grud2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Пуловер лежа с гантелей", Description = context.getString(R.string.puloverDescription),
                Group = "Грудь", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.pulover1, R.drawable.pulover2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Разведение рук с гантелями", Description = context.getString(R.string.razvedRukSGantDescription),
                Group = "Грудь", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.razved_ruk_s_gant1, R.drawable.razved_ruk_s_gant2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сведение рук в кроссовере", Description = context.getString(R.string.svedRukVCrossoverDescription),
                Group = "Грудь", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.sved_ruk_v_crossover1, R.drawable.sved_ruk_v_crossover2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сведение рук в тренажере (бабочка)", Description = context.getString(R.string.babochkaDescription),
                Group = "Грудь", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.babochka1, R.drawable.babochka2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="T - отжимания (с петлями)", Description = context.getString(R.string.tOtzhimSPetlDescription),
                Group = "Грудь", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.t_otzhim_s_petl1, R.drawable.t_otzhim_s_petl2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Концентрированные сгибания на бицепс", Description = context.getString(R.string.concSgibBicepsDescription),
                Group = "Бицепс", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.conc_sgib_biceps1, R.drawable.conc_sgib_biceps2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание рук в локтевом суставе с гантелями хватом «молот»", Description = context.getString(R.string.molotokDescription),
                Group = "Бицепс", Subgroup = "", Level = "Легкий"), mutableListOf(R.drawable.sgibanie_ruk_molot1, R.drawable.sgibanie_ruk_molot2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание рук в локтевом суставе на верхнем блоке", Description = context.getString(R.string.sgibRukVerhBlockDescription),
                Group = "Бицепс", Subgroup = "", Level = "Легкий"), mutableListOf(R.drawable.sgib_ruk_v_lokt_sust_verh_block1, R.drawable.sgib_ruk_v_lokt_sust_verh_block2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание рук на нижнем блоке в кроссовере", Description = context.getString(R.string.sgibRukNizhBlockDescription),
                Group = "Бицепс", Subgroup = "", Level = "Легкий"), mutableListOf(R.drawable.sgibanie_ruk_na_nizgnem_bloke1_biceps, R.drawable.sgibanie_ruk_na_nizgnem_bloke2_biceps))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание рук на скамье Скотта", Description = context.getString(R.string.sgibRukNaSkScottaDescription),
                Group = "Бицепс", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.sgib_ruk_na_sk_scotta1, R.drawable.sgib_ruk_na_sk_scotta2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание рук в локтевом суставе с гантелями на наклонной скамье", Description = context.getString(R.string.sgibRukSGantNaNaklSkDescription),
                Group = "Бицепс", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.sgibanie_ruk_ganteli_naklonnaua_1, R.drawable.sgibanie_ruk_ganteli_naklonnaua_2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание рук с гантелями стоя", Description = context.getString(R.string.sgibRukSGantStoyaDescription),
                Group = "Бицепс", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.sgib_ruk_s_gant_stoya1, R.drawable.sgib_ruk_s_gant_stoya2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание рук со штангой стоя", Description = context.getString(R.string.sgibRukSoShtStoyaDescription),
                Group = "Бицепс", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.sgib_ruk_so_sht_stoya1, R.drawable.sgib_ruk_so_sht_stoya2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание рук стоя с петлями", Description = context.getString(R.string.sgibRukStoyaSPetlDescription),
                Group = "Бицепс", Subgroup = "", Level = "Средний"), mutableListOf(R.drawable.sgib_ruk_stoya_s_petlyami1, R.drawable.sgib_ruk_stoya_s_petlyami2))


            val zashagId = fillSingleExcersizeInfo(context, db, Excersize(Name="Зашагивания на скамью с гантелями", Description = context.getString(R.string.zashagNaSkamuDescription),
                Group = "Ноги", Subgroup = "Бедра", Level = "Легкий"),mutableListOf(R.drawable.zashagivaniua_na_skamu1, R.drawable.zashagivaniua_na_skamu2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сведение ног в тренажере", Description = context.getString(R.string.svedNogVTrenDescription),
                Group = "Ноги", Subgroup = "Бедра", Level = "Легкий"), mutableListOf(R.drawable.sved_nog_v_tren1, R.drawable.sved_nog_v_tren2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание ног в тренажере лежа", Description = context.getString(R.string.sgibNogVTrenLezhaDescription),
                Group = "Ноги", Subgroup = "Бедра", Level = "Средний"), mutableListOf(R.drawable.sgib_nog_v_tren_lezha1, R.drawable.sgib_nog_v_tren_lezha2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание ног в тренажёре сидя", Description = context.getString(R.string.sgibNogVTrenSidyaDescription),
                Group = "Ноги", Subgroup = "Бедра", Level = "Средний"), mutableListOf(R.drawable.sgib_nog_v_tren_sidya1, R.drawable.sgib_nog_v_tren_sidya1))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Становая тяга со штангой на прямых ногах", Description = context.getString(R.string.stanTyagaNaPrNogahDescription),
                Group = "Ноги", Subgroup = "Бедра", Level = "Сложный"), mutableListOf(R.drawable.stan_tyaga_so_sht_na_pr_nogah1, R.drawable.stan_tyaga_so_sht_na_pr_nogah2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Подъём на носки сидя", Description = context.getString(R.string.podyemNaNoskiSidyaDescription),
                Group = "Ноги", Subgroup = "Икры", Level = "Легкий"), mutableListOf(R.drawable.podyem_na_noski_sidya1, R.drawable.podyem_na_noski_sidya2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Подъем на носки стоя", Description = context.getString(R.string.podyemNaNoskiStoyaDescription),
                Group = "Ноги", Subgroup = "Икры", Level = "Легкий"), mutableListOf(R.drawable.podyem_na_noski_stoya1, R.drawable.podyem_na_noski_stoya2))
            val prisedId = fillSingleExcersizeInfo(context, db, Excersize(Name="Приседания со штангой", Description = context.getString(R.string.prisedSoShtDescription),
                Group = "Ноги", Subgroup = "Квадрицепсы", Level = "Сложный"),mutableListOf(R.drawable.prised_so_sht1, R.drawable.prised_so_sht2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Болгарские выпады", Description = context.getString(R.string.bolgarVypadyDescription),
                Group = "Ноги", Subgroup = "Квадрицепсы", Level = "Средний"),mutableListOf(R.drawable.bolgarskie_vypady1, R.drawable.bolgarskie_vypady2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Выпады с гантелями", Description = context.getString(R.string.vypadySGantVperedDescription),
                Group = "Ноги", Subgroup = "Квадрицепсы", Level = "Средний"),mutableListOf(R.drawable.vypady_s_gant1, R.drawable.vypady_s_gant1))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Жим ногами в тренажёре", Description = context.getString(R.string.zhimNogamiVTrenDescription),
                Group = "Ноги", Subgroup = "Квадрицепсы", Level = "Средний"),mutableListOf(R.drawable.zhim_nogami_v_tren1, R.drawable.zhim_nogami_v_tren2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Приседания в гакк-тренажере", Description = context.getString(R.string.gakkPrisedVTrenDescription),
                Group = "Ноги", Subgroup = "Квадрицепсы", Level = "Средний"),mutableListOf(R.drawable.gakk_prised1, R.drawable.gakk_prised2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Разгибание ног в тренажере сидя", Description = context.getString(R.string.razgibNogVTrenDescription),
                Group = "Ноги", Subgroup = "Квадрицепсы", Level = "Средний"),mutableListOf(R.drawable.razgib_nog_v_tren1, R.drawable.razgib_nog_v_tren2))

            fillSingleExcersizeInfo(context, db, Excersize(Name="Армейский жим", Description = context.getString(R.string.armZhimDescription),
                Group = "Плечи", Subgroup = "", Level = "Сложный"),mutableListOf(R.drawable.arm_zhim1, R.drawable.arm_zhim2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Жим Арнольда", Description = context.getString(R.string.arnoldZhimDescription),
                Group = "Плечи", Subgroup = "", Level = "Сложный"),mutableListOf(R.drawable.zhim_arnold1, R.drawable.zhim_arnold2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Жим гантелей стоя", Description = context.getString(R.string.zhimGantStoyaDescription),
                Group = "Плечи", Subgroup = "", Level = "Сложный"),mutableListOf(R.drawable.zhim_gant_vverh_stoya1, R.drawable.zhim_gant_vverh_stoya1))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Жим гантелей сидя", Description = context.getString(R.string.zhimGantSidyaDescription),
                Group = "Плечи", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.zhim_gant_sidya1, R.drawable.zhim_gant_sidya2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Жим штанги из-за головы", Description = context.getString(R.string.zhimShtZaGolovuDescription),
                Group = "Плечи", Subgroup = "", Level = "Сложный"),mutableListOf(R.drawable.zhim_sht_za_golovu_stoya1, R.drawable.zhim_sht_za_golovu_stoya2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Отведение гантелей через стороны стоя", Description = context.getString(R.string.otvedGantStoyaDescription),
                Group = "Плечи", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.otved_gant1, R.drawable.otved_gant2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Отведение гантелей сидя", Description = context.getString(R.string.otvedGantSidyaDescription),
                Group = "Плечи", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.otved_gant_sidya1, R.drawable.otved_gant_sidya2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Отжимания вниз головой с опорой о стену", Description = context.getString(R.string.otzhimVnizGolovoiDescription),
                Group = "Плечи", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.otzhim_vniz_golovoi1, R.drawable.otzhim_vniz_golovoi2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Подъем гантелей перед собой", Description = context.getString(R.string.podyemGantPeredSoboiDescription),
                Group = "Плечи", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.podyem_gantelei_pered_soboi1, R.drawable.podyem_gantelei_pered_soboi2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Разведение рук с гантелями в наклоне стоя", Description = context.getString(R.string.razvedGantVStDescription),
                Group = "Плечи", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.razvedenie_ruk_v_naklone1, R.drawable.razvedenie_ruk_v_naklone2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Разведения рук с гантелями лежа на наклонной скамье лицом вниз", Description = context.getString(R.string.razvedRukSGantVNaklLezhaDescription),
                Group = "Плечи", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.razved_ruk_s_gant_lezha_na_nakl_sk1, R.drawable.razved_ruk_s_gant_lezha_na_nakl_sk2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга штанги к подбородку", Description = context.getString(R.string.tyagaPodbDescription),
                Group = "Плечи", Subgroup = "", Level = "Легкий"),mutableListOf(R.drawable.tyga_podb1, R.drawable.tyga_podb2))

            fillSingleExcersizeInfo(context, db, Excersize(Name="Косые скручивания на полу", Description = context.getString(R.string.kosyeSkruchNaPoluDescription),
                Group = "Пресс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.kosye_skruch_na_polu1, R.drawable.kosye_skruch_na_polu2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Косые скручивания на силовой скамье", Description = context.getString(R.string.kosyeSkruchNaSilSkDescription),
                Group = "Пресс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.kosye_skruch_na_sil_sk1, R.drawable.kosye_skruch_na_sil_sk2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Скручивания на верхнем блоке", Description = context.getString(R.string.molitvaDescription),
                Group = "Пресс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.molitva1, R.drawable.molitva2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Ножницы", Description = context.getString(R.string.nozhnicyDescription),
                Group = "Пресс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.nozhnicy1, R.drawable.nozhnicy2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Обратные скручивания", Description = context.getString(R.string.obratSkruchDescription),
                Group = "Пресс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.obrat_skruch1, R.drawable.obrat_skruch2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Планка", Description = context.getString(R.string.plankaDescription),
                Group = "Пресс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.planka1, R.drawable.planka2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Подъем ног в висе", Description = context.getString(R.string.podyemNogVViseDescription),
                Group = "Пресс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.podyem_nog_v_vise1, R.drawable.podyem_nog_v_vise2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Подъем ног в упоре на локти", Description = context.getString(R.string.podyemNogVUporeDescription),
                Group = "Пресс", Subgroup = "", Level = "Легкий"),mutableListOf(R.drawable.podyem_nog_v_upore1, R.drawable.podyem_nog_v_upore2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Скручивания лёжа на полу", Description = context.getString(R.string.skruchLezhaNaPoluDescription),
                Group = "Пресс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.skruch_na_polu1, R.drawable.skruch_na_polu2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Скручивания на наклонной скамье", Description = context.getString(R.string.skruchNaNaklSkDescription),
                Group = "Пресс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.ckruchnanaklon1, R.drawable.ckruchnanaklon2))


            val stanId = fillSingleExcersizeInfo(context, db, Excersize(Name="Становая тяга", Description = context.getString(R.string.stanTyagaDescription),
                Group = "Спина", Subgroup = "Низ спины", Level = "Сложный"),mutableListOf(R.drawable.stan_tyga_klass1, R.drawable.stan_tyga_klass2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Гиперэкстензия", Description = context.getString(R.string.giperextensiaDescription),
                Group = "Спина", Subgroup = "Низ спины", Level = "Средний"),mutableListOf(R.drawable.giperextensia1, R.drawable.giperextensia2))
            val avsId = fillSingleExcersizeInfo(context, db, Excersize(Name="Австралийские подтягивания", Description = context.getString( R.string.avstralPodtyagDescription),
                Group = "Спина", Subgroup = "Средняя часть спины", Level = "Легкий"),mutableListOf(R.drawable.avstral_podtyag1, R.drawable.avstral_podtyag2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Т - разведение рук (в петлях)", Description = context.getString( R.string.tRazvedDescription),
                Group = "Спина", Subgroup = "Средняя часть спины", Level = "Средний"),mutableListOf(R.drawable.t_razved_ruk1, R.drawable.t_razved_ruk2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга нижнего (горизонтального) блока к поясу", Description = context.getString( R.string.tyagaNizhGorizontBlDescription),
                Group = "Спина", Subgroup = "Средняя часть спины", Level = "Средний"),mutableListOf(R.drawable.tyaga_nizh_gorizin_bl_k_poyasu1, R.drawable.tyaga_nizh_gorizin_bl_k_poyasu2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга одной гантели в наклоне", Description = context.getString( R.string.tyaga1GantVNaklDescription),
                Group = "Спина", Subgroup = "Средняя часть спины", Level = "Сложный"),mutableListOf(R.drawable.tyaga_1_gant_v_nakl1, R.drawable.tyaga_1_gant_v_nakl2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Махи с гирей", Description = context.getString( R.string.mahiSGireiDescription),
                Group = "Спина", Subgroup = "Средняя часть спины", Level = "Сложный"),mutableListOf(R.drawable.mahi_s_girei1, R.drawable.mahi_s_girei2, R.drawable.mahi_s_girei3))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга штанги за спиной", Description = context.getString( R.string.tyagiZaSpinoiDescription),
                Group = "Спина", Subgroup = "Трапеция", Level = "Средний"),mutableListOf(R.drawable.tyagi_za_spinoi1, R.drawable.tyagi_za_spinoi2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Шраги с гантелями стоя", Description = context.getString( R.string.shragiSGantDescription),
                Group = "Спина", Subgroup = "Трапеция", Level = "Легкий"),mutableListOf(R.drawable.shragi_gant1, R.drawable.shragi_gant2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Шраги со штангой стоя", Description = context.getString( R.string.shragiSoShtDescription),
                Group = "Спина", Subgroup = "Трапеция", Level = "Легкий"),mutableListOf(R.drawable.shragi_sht1, R.drawable.shragi_sht2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Подтягивания обратным хватом", Description = context.getString( R.string.podtyagObratHvDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Средний"),mutableListOf(R.drawable.podtyag_obrat_hv1, R.drawable.podtyag_obrat_hv2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Подтягивания прямым хватом", Description = context.getString( R.string.podtyagPramymHvDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Средний"),mutableListOf(R.drawable.podtyag_pramym_hv1, R.drawable.podtyag_pramym_hv2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Подтягивания широким хватом", Description = context.getString( R.string.podtyagShirHvDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Средний"),mutableListOf(R.drawable.podtyag_shir_hv1, R.drawable.podtyag_shir_hv2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Пуловер в кроссовере", Description = context.getString( R.string.puloverVCrossDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Легкий"),mutableListOf(R.drawable.pulover_v_crossovere1, R.drawable.pulover_v_crossovere2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга за голову верхнего блока (вертикального)", Description = context.getString( R.string.tyagaZaGolovuDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Средний"),mutableListOf(R.drawable.tjaga_za_golovu_verhnego_bloka1, R.drawable.tjaga_za_golovu_verhnego_bloka2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга верхнего блока к груди", Description = context.getString( R.string.tyagaVerhBlKGrudiDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Средний"),mutableListOf(R.drawable.tyaga_verh_bl_k_grudi1, R.drawable.tyaga_verh_bl_k_grudi2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга в петлях к груди", Description = context.getString( R.string.tyagaVPetlKGrudiDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Средний"),mutableListOf(R.drawable.tyaga_v_petl_k_grudi1, R.drawable.tyaga_v_petl_k_grudi2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга гантелей лежа на скамье на животе", Description = context.getString( R.string.tyagaGantLezhaNaSkKZhivDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Средний"),mutableListOf(R.drawable.tyaga_gant_lezha_na_sk_na_zhivote1, R.drawable.tyaga_gant_lezha_na_sk_na_zhivote2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга гантелей стоя в наклоне", Description = context.getString( R.string.tyagaGantStoyaVNaklDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Сложный"),mutableListOf(R.drawable.tyaga_gant_stoya_v_nakl1, R.drawable.tyaga_gant_stoya_v_nakl2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга рычажная вертикальная", Description = context.getString( R.string.tyagaRychazhVertDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Легкий"),mutableListOf(R.drawable.tyaga_rychazh_vert1, R.drawable.tyaga_rychazh_vert2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга т-грифа в наклоне к поясу", Description = context.getString( R.string.tyagaTGrifaVNaklKPoyasuDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Средний"),mutableListOf(R.drawable.tyaga_t_grifa1, R.drawable.tyaga_t_grifa2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Тяга штанги в наклоне к поясу", Description = context.getString( R.string.tyagaShtVNaklKPoyasuDescription),
                Group = "Спина", Subgroup = "Широчайшие", Level = "Сложный"),mutableListOf(R.drawable.tyga_sht_v_nakl_k_poyasu1, R.drawable.tyga_sht_v_nakl_k_poyasu2))

            fillSingleExcersizeInfo(context, db, Excersize(Name="Жим штанги узким хватом", Description = context.getString( R.string.zhimShtUzHvDescription),
                Group = "Трицепс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.zhim_sht_uz_hv1, R.drawable.zhim_sht_uz_hv2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Отведение руки с гантелей в наклоне", Description = context.getString( R.string.otvedRukSGantVNaklDescription),
                Group = "Трицепс", Subgroup = "", Level = "Сложный"),mutableListOf(R.drawable.otved_ruk_s_gant_v_nakl1, R.drawable.otved_ruk_s_gant_v_nakl2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Отжимания от пола, ноги в петлях", Description = context.getString( R.string.otzhimOtPolaNogiVPetlDescription),
                Group = "Трицепс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.otzhim_ot_pola_nogi_v_petl1, R.drawable.otzhim_ot_pola_nogi_v_petl2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Отжимания спиной к скамье", Description = context.getString( R.string.otzhimSpinoiKSkDescription),
                Group = "Трицепс", Subgroup = "", Level = "Легкий"),mutableListOf(R.drawable.otzhim_spinoi_k_sk1, R.drawable.otzhim_spinoi_k_sk2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Разгибание рук в локтевом суставе на блоке стоя", Description = context.getString( R.string.razgibRukNaBlDescription),
                Group = "Трицепс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.razgib_ruk_na_bloke1, R.drawable.razgib_ruk_na_bloke2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание предплечий (трицепс) (в петлях)", Description = context.getString( R.string.sgibPredpVPetlDescription),
                Group = "Трицепс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.sgib_predp_v_petl1, R.drawable.sgib_predp_v_petl2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Французский жим лёжа", Description = context.getString( R.string.francZhimLezhaDescription),
                Group = "Трицепс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.franc_zhim_lezha1, R.drawable.franc_zhim_lezha2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Французский жим с гантелями сидя", Description = context.getString( R.string.francZhimSGantSidyaDescription),
                Group = "Трицепс", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.franc_zhim_s_gant_sidya1, R.drawable.franc_zhim_s_gant_sidya2))

            fillSingleExcersizeInfo(context, db, Excersize(Name="Разгибание шеи лёжа на скамье", Description = context.getString( R.string.razgibSheiDescription),
                Group = "Шея", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.razgib_shei1, R.drawable.razgib_shei2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Сгибание шеи лёжа на скамье", Description = context.getString( R.string.sgibSheiDescription),
                Group = "Шея", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.sgib_shei1, R.drawable.sgib_shei2))

            fillSingleExcersizeInfo(context, db, Excersize(Name="Выпады в движении с собственным весом", Description = context.getString( R.string.vypadyVDvizhSSobstvVesomDescription),
                Group = "Ягодицы", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.vypady_v_dvizh_s_sobstv_vesom1, R.drawable.vypady_v_dvizh_s_sobstv_vesom2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Выпады со штангой", Description = context.getString( R.string.vypadyVDvizhSSobstvVesomDescription),
                Group = "Ягодицы", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.vypady_so_sht1, R.drawable.vypady_so_sht2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Отведение ноги назад", Description = context.getString( R.string.otvedNogiNazadDescription),
                Group = "Ягодицы", Subgroup = "", Level = "Легкий"),mutableListOf(R.drawable.otved_nogi_nazad1, R.drawable.otved_nogi_nazad2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Подъем таза лежа", Description = context.getString( R.string.podyemTazaLezhaDescription),
                Group = "Ягодицы", Subgroup = "", Level = "Легкий"),mutableListOf(R.drawable.podyem_taza_lezha1, R.drawable.podyem_taza_lezha2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Приседания с гантелями", Description = context.getString( R.string.prisedSGantDescription),
                Group = "Ягодицы", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.prised_s_gant1, R.drawable.prised_s_gant2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Прыжки на ящик", Description = context.getString( R.string.pryzhiNaYashikDescription),
                Group = "Ягодицы", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.pryzhki_na_yashik1, R.drawable.pryzhki_na_yashik2, R.drawable.pryzhki_na_yashik3,
                R.drawable.pryzhki_na_yashik4))
            fillSingleExcersizeInfo(context, db, Excersize(Name="Разведение ног в тренажере", Description = context.getString( R.string.razvedNogVTrenDescription),
                Group = "Ягодицы", Subgroup = "", Level = "Легкий"),mutableListOf(R.drawable.razved_nog_v_tren1, R.drawable.razved_nog_v_tren2))
            fillSingleExcersizeInfo(context, db, Excersize(Name="\"Ягодичный мост\" от скамьи", Description = context.getString( R.string.yagodicMostDescription),
                Group = "Ягодицы", Subgroup = "", Level = "Средний"),mutableListOf(R.drawable.yagodic_most_ot_sk1, R.drawable.yagodic_most_ot_sk2))


            val prog1Day1Id = db.trainingProgramDayDao.insert(TrainingProgramDay(trainingProgramId = progId, DayName = "День 1"))
            val prog1Day2Id = db.trainingProgramDayDao.insert(TrainingProgramDay(trainingProgramId = progId, DayName = "День 2"))
            val prog1Day3Id = db.trainingProgramDayDao.insert(TrainingProgramDay(trainingProgramId = progId, DayName = "День 3"))

            db.trainingProgramsExcercizesDao.insert(TrainingProgramsExcersizes( DayId = prog1Day1Id, excersizeId = zhimLezhaId))
            db.trainingProgramsExcercizesDao.insert(TrainingProgramsExcersizes(DayId = prog1Day1Id, excersizeId = shimNaklId))

            db.trainingProgramsExcercizesDao.insert(TrainingProgramsExcersizes(DayId = prog1Day2Id, excersizeId = stanId))
            db.trainingProgramsExcercizesDao.insert(TrainingProgramsExcersizes(DayId = prog1Day2Id, excersizeId = avsId))

            db.trainingProgramsExcercizesDao.insert(TrainingProgramsExcersizes(DayId = prog1Day3Id, excersizeId = prisedId))

            progId = db.trainingProgramDao.insert(TrainingProgram(Name = "Дополнительная"))
            val prog2Day1Id = db.trainingProgramDayDao.insert(TrainingProgramDay(trainingProgramId = progId, DayName = "День 1"))
            val prog2Day2Id = db.trainingProgramDayDao.insert(TrainingProgramDay(trainingProgramId = progId, DayName = "День 2"))

            db.trainingProgramsExcercizesDao.insert(TrainingProgramsExcersizes(DayId = prog2Day1Id, excersizeId = prisedId))
            db.trainingProgramsExcercizesDao.insert(TrainingProgramsExcersizes(DayId = prog2Day2Id, excersizeId = zashagId))


            val profileId = db.trainingProfileDao.insert(TrainingProfile(Name = "Все упражнения"))
            val exs = db.excersizeDao.getAll()
            for(ex in exs) {
                db.trainingProfilesExcersizesDao.insert(TrainingProfileExcersize(trainingProfileId = profileId, excersizeId = ex.ExcersizeId))
            }



        }

        fun fillSingleExcersizeInfo(context: Context, db: ExcersizeDatabase, excersize: Excersize, photosResources: List<Int>):Long? {
            val exId = db.excersizeDao.insert(excersize)
            for (res in photosResources) {
                val imgPath = saveImageToFolder(context, res , context.getResources().getResourceEntryName(res))
                val photoId = db.photoDao.insert(Photo(path=imgPath))
                db.excercizePhotoDao.insert(ExcersizePhoto(excersizeId = exId, photoId = photoId))
            }

            return exId
        }

        lateinit var outputStream: OutputStream
        fun saveImageToFolder(context: Context, resId: Int, name: String):String {

            val bitmap: Bitmap = BitmapFactory.decodeResource(context.resources, resId)

            val filesDir = context.filesDir;

            val dir = File(filesDir.absolutePath + "/Excercizes/")
            if (!dir.exists())
                dir.mkdirs()

            val file = File(dir, "$name.jpeg")

            if (file.exists())
                return file.absolutePath

            val resPath: String = file.absolutePath

            try {
                outputStream = FileOutputStream(file)
            }
            catch (e: FileNotFoundException) {
                e.printStackTrace()
            }

            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)

            try {
                outputStream.flush()
            }
            catch (e: IOException) {
                e.printStackTrace()
            }

            try {
                outputStream.close()
            }
            catch (e: IOException) {
                e.printStackTrace()
            }

            return resPath

        }


    }

}