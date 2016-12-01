package info.krushik.android.sr2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

//обект - портфель, килограммы веса, название компании, енум: для компа, для учебы для картошки
public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    Spinner spinner;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);

        spinner = (Spinner) findViewById(R.id.spinner);
        String selected = ((Bag)spinner.getSelectedItem()).getPurpose();

        textView = (TextView)findViewById(R.id.textView);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                    textView.setText();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }


    }


}
