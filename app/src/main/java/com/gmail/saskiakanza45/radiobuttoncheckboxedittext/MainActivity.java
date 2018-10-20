package com.gmail.saskiakanza45.radiobuttoncheckboxedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //ini deklarasi atribut tampilan/view
    EditText editNama, editNim;
    TextView texthasil;
    Button tombolSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Koneksi atribut dengan XML: memanggil nilai dari inputan nama dan nim*/
        editNama = (EditText)findViewById(R.id.editNamaMhs);
        editNim = (EditText)findViewById(R.id.editNimMhs);
        texthasil = (TextView)findViewById(R.id.txtHasil);
        tombolSubmit = (Button)findViewById(R.id.button);
    }

    protected void onClick(View view){
        String nama, nim;
        nama = editNama.getText().toString();
        nim = editNim.getText().toString();
        texthasil.setText("" + nama + " - " + nim); //mengatur format tampilan
    }
}
