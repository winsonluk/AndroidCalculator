package summit.org.summitcalculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TipCalculatorActivity extends AppCompatActivity {

    public static Intent getStartIntent(Context context) {
        return new Intent(context, TipCalculatorActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }
}
