package qa.edu.qu.cmps312.ilearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoryActivity extends AppCompatActivity {

    private Button alphabetsBtn;
    private Button numbersBtn;
    private Button colorsBtn;
    private Button shapesBtn;
    private String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        alphabetsBtn = findViewById(R.id.alphabets_btn);
        numbersBtn = findViewById(R.id.numbers_btn);
        colorsBtn = findViewById(R.id.colors_btn);
        shapesBtn = findViewById(R.id.shapes_btn);

        choice = getIntent().getStringExtra("choice");

        alphabetsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice.equals("learn")) {
                    Intent intent = new Intent(CategoryActivity.this, LearnActivity.class);
                    intent.putExtra("category","alphabets");
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(CategoryActivity.this, QuizActivity.class);
                    intent.putExtra("category","alphabets");
                    startActivity(intent);
                }
            }
        });

        numbersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice.equals("learn")) {
                    Intent intent = new Intent(CategoryActivity.this, LearnActivity.class);
                    intent.putExtra("category","numbers");
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(CategoryActivity.this, QuizActivity.class);
                    intent.putExtra("category","numbers");
                    startActivity(intent);
                }
            }
        });

        colorsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice.equals("learn")) {
                    Intent intent = new Intent(CategoryActivity.this, LearnActivity.class);
                    intent.putExtra("category","colors");
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(CategoryActivity.this, QuizActivity.class);
                    intent.putExtra("category","colors");
                    startActivity(intent);
                }
            }
        });

        shapesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice.equals("learn")) {
                    Intent intent = new Intent(CategoryActivity.this, LearnActivity.class);
                    intent.putExtra("category","shapes");
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(CategoryActivity.this, QuizActivity.class);
                    intent.putExtra("category","shapes");
                    startActivity(intent);
                }
            }
        });
    }
}
