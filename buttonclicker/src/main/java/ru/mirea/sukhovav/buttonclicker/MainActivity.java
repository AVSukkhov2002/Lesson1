package ru.mirea.sukhovav.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewStudent;
    Button btnOk;
    Button btnCancel;

    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStudent = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        checkBox = (CheckBox) findViewById(R.id.checkBox);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № Х");
                checkBox.setChecked(true);
            }
        };

        View.OnClickListener oclbtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Это не я сделал");
                checkBox.setChecked(false);
            }
        };


        btnOk.setOnClickListener(oclBtnOk);
        btnCancel.setOnClickListener(oclbtnCancel);


    }
}