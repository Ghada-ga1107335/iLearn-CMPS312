package qa.edu.qu.cmps312.ilearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    private TextView categoryTV;
    private String category;
    private ArrayList<Question> questionsBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        categoryTV = findViewById(R.id.quiz_category_tv);

        category = getIntent().getStringExtra("category");

        categoryTV.setText(category);
    }
}
