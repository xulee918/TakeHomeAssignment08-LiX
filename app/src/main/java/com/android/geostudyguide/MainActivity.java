package com.android.geostudyguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionAdapter(questions, this));
    }

    private void initialData() {
        questions = new ArrayList<>();
        questions.add(new Question(R.string.question_mesopotamia, true));
        questions.add(new Question(R.string.question_egypt, true));
        questions.add(new Question(R.string.question_ww1, false));
        questions.add(new Question(R.string.question_ww2, false));
        questions.add(new Question(R.string.question_rome, true));
        questions.add(new Question(R.string.question_china, false));
        questions.add(new Question(R.string.question_einstein, true));
    }
}
