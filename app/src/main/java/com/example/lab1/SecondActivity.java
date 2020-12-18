package com.example.lab1;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    private Button convert_am_button;
    String[] currencies_am = {"Аргентинське песо ARS", "Бразильський реал BRL", "Чилійське песо CLP", "Панамський бальбоа PAB", "Ямайський долар JMD"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        convert_am_button = findViewById(R.id.convert_am_button);

        Spinner spinner_from_am = (Spinner) findViewById(R.id.currencies_from_spinner_am);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter_from_am = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currencies_am);
        // Определяем разметку для использования при выборе элемента
        adapter_from_am.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner_from_am.setAdapter(adapter_from_am);

        Spinner spinner_to_am = (Spinner) findViewById(R.id.currencies_to_spinner_am);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter_to_am = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currencies_am);
        // Определяем разметку для использования при выборе элемента
        adapter_to_am.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner_to_am.setAdapter(adapter_to_am);
    }
}