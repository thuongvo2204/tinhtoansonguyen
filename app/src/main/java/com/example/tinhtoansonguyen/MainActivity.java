package com.example.tinhtoansonguyen;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber1, editTextNumber2;
    TextView textResult;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;

    Calculator calculator; // Khai báo Calculator

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textResult = findViewById(R.id.textResult);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);

        calculator = new Calculator(); // Khởi tạo

        btnAdd.setOnClickListener(view -> calculate('+'));
        btnSubtract.setOnClickListener(view -> calculate('-'));
        btnMultiply.setOnClickListener(view -> calculate('*'));
        btnDivide.setOnClickListener(view -> calculate('/'));
    }

    private void calculate(char operator) {
        String s1 = editTextNumber1.getText().toString();
        String s2 = editTextNumber2.getText().toString();

        if (s1.isEmpty() || s2.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đủ hai số", Toast.LENGTH_SHORT).show();
            return;
        }

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        String result;

        try {
            switch (operator) {
                case '+':
                    result = String.valueOf(calculator.add(num1, num2));
                    break;
                case '-':
                    result = String.valueOf(calculator.subtract(num1, num2));
                    break;
                case '*':
                    result = String.valueOf(calculator.multiply(num1, num2));
                    break;
                case '/':
                    result = String.valueOf(calculator.divide(num1, num2));
                    break;
                default:
                    result = "Lỗi";
            }
        } catch (IllegalArgumentException e) {
            result = e.getMessage();
        }

        textResult.setText("Kết quả: " + result);
    }
}
