package by.ivpo.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class BackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        setCapital();

    }

    private void setCapital() {
        Intent intent = getIntent();
        String capital = intent.getStringExtra("capital");
        CapitalFragment capitalFragment = (CapitalFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        capitalFragment.setCapital(capital);
    }

}
