package summit.org.summitcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @SuppressWarnings("ConstantConditions")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set click listeners on button
        findViewById(R.id.btn_calc).setOnClickListener(this);
        findViewById(R.id.btn_tip_calc).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_calc:
                //Start calculator activity
                startActivity(CalculatorActivity.getStartIntent(this));
                break;
            case R.id.btn_tip_calc:
                //Start calculator activity
                startActivity(TipCalculatorActivity.getStartIntent(this));
                break;
        }
    }
}
