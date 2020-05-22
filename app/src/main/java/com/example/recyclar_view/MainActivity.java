package com.example.recyclar_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<IndianMovies> movies = new ArrayList<>();

        int posters[] = {R.mipmap.bajrang_bhaijaan_poster, R.mipmap.threeidiots_poster,
                R.mipmap.pk_poster, R.mipmap.ghajini_poster, R.mipmap.gabbar_poster,
                R.mipmap.ek_tha_tiger_poster};

        String movienames[] = {"Bajrang Bhaijaan", "3 Idiots", "PK", "Ghajini", "Gabbar is Back,Emad",
                "Ek tha Tiger"};

        String moviesRates[] = {"9.9/10", "9.5/10", "9.1/10", "9/10", "8.5/10", "8.4/10","2/10"};

        String moviesStories[] = {"قصة فتاة باكستانيه صغيرة لا تتكلم  تذهب مع والدتها للهند وتتوه منها هناك وتعود والدتها بدونها ",
                "قصة تلاث شباب يدخلون كلية الهندسة تناقش امور التعليم وان المؤسسات التعلمية تهتم بتحفيظ الطلاب اكثر من جعلهم يفهمون فى سياق من التشويق والمغامرات ",
                "قصة كائن فضائى ينزل الى كوكب الارض وأول ما يحدث له ان تتم سرقته من احد اللصوص فيبدأ العيش مع البشر والتعرف على الالهه والاديان ",
                "قصة شاب رجل اعمال يحدث له حادثة ويفقد الذاكرة ويحاول أن يقوم بالانتقام  تشبه فيلم فاصل ونعود المصرية ",
                "جبار يعمل فى الخفاء على محاربة الفساد فى الدولة مما القى الرعب فى قلوب المفسدين حيث كاناو يتقاتلون على الاعتراف اولا بفسادهم للحكومة حتى لا يقتلهم جبار ",
                "شاب تابع لوكالة الاستخبارات الهندية يقع فى حب فتاة تعمل فى الاستخبارات الباكستانيه وبرغم التوتر بين البلدين يجد كل منهما الاخر فى موقف حرج فيقرران ترك السياسة والهرب معا ","HTI"};


        for (int i = 0; i < posters.length; i++) {

            IndianMovies movie =
                    new IndianMovies(movienames[i], moviesRates[i], moviesStories[i], posters[i]);

            movies.add(movie);


        }

        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        indianMoviesAdapter adapter = new indianMoviesAdapter(movies);
        recyclerView.setAdapter(adapter);



    }
    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}
