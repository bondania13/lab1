package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class ThirdActivity extends AppCompatActivity {

    private Button convert_eu_button;
    String[] currencies_eu = {"Євро EUR", "Фунт Стерлінгів GBP", "Крона DKK", "Гривня UAH", "Злотий PLN", "Білоруський Рубль BYR ", "Молдавський Лей MDL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        convert_eu_button = findViewById(R.id.convert_eu_button);


        Spinner spinner_from_eu = (Spinner) findViewById(R.id.currencies_from_spinner_eu);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter_from_eu = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currencies_eu);
        // Определяем разметку для использования при выборе элемента
        adapter_from_eu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner_from_eu.setAdapter(adapter_from_eu);

        Spinner spinner_to_eu = (Spinner) findViewById(R.id.currencies_to_spinner_eu);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter_to_eu = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currencies_eu);
        // Определяем разметку для использования при выборе элемента
        adapter_to_eu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner_to_eu.setAdapter(adapter_to_eu);





    }
}
