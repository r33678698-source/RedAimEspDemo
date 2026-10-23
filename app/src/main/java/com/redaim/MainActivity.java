package com.redaim;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем основной контейнер (черный фон)
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.BLACK);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(50, 50, 50, 50);

        // Заголовок (красный)
        TextView title = new TextView(this);
        title.setText("RedAimEsp Demo");
        title.setTextColor(Color.RED);
        title.setTextSize(28);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 0, 0, 50);
        layout.addView(title);

        // Переключатель Aim Demo
        Switch aimSwitch = new Switch(this);
        aimSwitch.setText("Aim Demo");
        aimSwitch.setTextColor(Color.WHITE);
        aimSwitch.setTextSize(20);
        aimSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Aim Demo: " + (isChecked ? "ON" : "OFF"), Toast.LENGTH_SHORT).show();
            }
        });
        layout.addView(aimSwitch);

        // Переключатель ESP Demo
        Switch espSwitch = new Switch(this);
        espSwitch.setText("ESP Demo");
        espSwitch.setTextColor(Color.WHITE);
        espSwitch.setTextSize(20);
        espSwitch.setPadding(0, 30, 0, 0);
        espSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "ESP Demo: " + (isChecked ? "ON" : "OFF"), Toast.LENGTH_SHORT).show();
            }
        });
        layout.addView(espSwitch);

        // Устанавливаем наш layout как главный экран
        setContentView(layout);
    }
}
