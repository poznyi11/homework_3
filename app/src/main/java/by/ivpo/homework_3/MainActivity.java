package by.ivpo.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CountryFragment.FragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void update(String capital) {
        String s = "s";
        int x = R.id.textCapital;
        CapitalFragment capitalFragment = (CapitalFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        capitalFragment.setCapital(capital);
    }

    @Override
    public void goBack(String capital) {
        Intent intent = new Intent(this, BackActivity.class);
        intent.putExtra("capital", capital);
        startActivity(intent);
    }
}
