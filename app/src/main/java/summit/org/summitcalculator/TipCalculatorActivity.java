package summit.org.summitcalculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class TipCalculatorActivity extends AppCompatActivity  implements View.OnClickListener {

    private double amount;
    private double tipPercent;

    private String tipString;
    private String totalString;

    private EditText totalEditText;
    private EditText tipEditText;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, TipCalculatorActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button = (Button)findViewById(R.id.btn_calculate);
        button.setOnClickListener(this);

        totalEditText = (EditText)findViewById(R.id.et_bill_amount);
        tipEditText = (EditText)findViewById(R.id.et_tip);
    }

    public void onClick(View v) {
        amount = Double.valueOf(totalEditText.getText().toString());
        tipPercent = Double.valueOf(tipEditText.getText().toString()) / 100;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        tipString = formatter.format(amount * tipPercent);
        totalString = formatter.format(amount * tipPercent + amount);

        ((TextView)findViewById(R.id.tv_result_tip)).setText(tipString);
        ((TextView)findViewById(R.id.tv_result_total)).setText(totalString);

    }
}
