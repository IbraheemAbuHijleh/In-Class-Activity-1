package com.example.inclassactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText Email;
    private RadioGroup grpRadio;
    private Button btn;
    private TextView txtv;
    private Switch last;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Hoks();
    }

    private void Hoks() {
        name=findViewById(R.id.name);

        Email=findViewById(R.id.Email);

        grpRadio=findViewById(R.id.grpRadio);

        btn=findViewById(R.id.btn);

        txtv=findViewById(R.id.txtv);

        last=findViewById(R.id.last);

        spinner=findViewById(R.id.spinner);
    }

    public void btnclick(View view) {

        String Name=name.getText().toString() ;

        String email= Email.getText().toString();

        int id= grpRadio.getCheckedRadioButtonId();
        if(id==-1 || Name==" "|| email==" "){

            Toast.makeText(MainActivity.this,"Enter Informmation",Toast.LENGTH_SHORT).show();

            return;
        }
        else {
            String inf=Name;
          String Major=spinner.getSelectedItem().toString();
            inf+="\n" +email ;
            inf+="\n" +Major +"\n";
            RadioButton rdo = findViewById(id);
            inf+=rdo.getText().toString();
            if(last.isChecked()){
                inf+="\n Las Year";
            }
            else{ inf+="\n Not Last Year";}
            txtv.setText(inf);

        }

    }
}