package summit.org.summitcalculator;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NavUtils;
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
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //TODO Set the actionbar title for this activity
        //TODO Set listeners on buttons
        //TODO Implement tip calculation logic
        //TODO Show the result to the user using the input from edit texts

    }
}
