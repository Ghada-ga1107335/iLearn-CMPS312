package qa.edu.qu.cmps312.ilearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LearnActivity extends AppCompatActivity {

    private TextView categoryTV;
    private String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        categoryTV = findViewById(R.id.learn_category_tv);

        category = getIntent().getStringExtra("category");

        categoryTV.setText(category);

    }
}
