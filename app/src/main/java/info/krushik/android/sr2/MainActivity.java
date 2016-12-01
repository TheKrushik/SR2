package info.krushik.android.sr2;

//обект - портфель, килограммы веса, название компании, енум: для компа, для учебы для картошки
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static info.krushik.android.sr2.Purpose.ENUM1;
import static info.krushik.android.sr2.Purpose.ENUM2;
import static info.krushik.android.sr2.Purpose.ENUM3;


public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText etName;
    private EditText etWeight;
    private Spinner spinner;
    private List<Bag> list = new ArrayList<>();
    private Button btnSave;
    private Button btnRead;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.etName);
        etWeight = (EditText) findViewById(R.id.etWeight);
        spinner = (Spinner) findViewById(R.id.spinner);
        textView = (TextView) findViewById(R.id.textView);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnRead = (Button) findViewById(R.id.btnRead);

        spinner.setAdapter(new ArrayAdapter<Purpose>(this, android.R.layout.simple_spinner_item, Purpose.values()));


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Purpose purpose;
                if (spinner.equals(ENUM1)) {
                    purpose = ENUM1;
                } else if (spinner.equals(ENUM2)){
                    purpose = ENUM2;
                }else {
                    purpose = ENUM3;
                }
                list.add(new Bag(etName.getText().toString(), Integer.valueOf(etWeight.getText().toString()), purpose));

            }
        });
        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(list.toString());
            }
        });
    }
}
