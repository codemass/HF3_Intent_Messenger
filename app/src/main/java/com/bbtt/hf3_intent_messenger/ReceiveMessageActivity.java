package com.bbtt.hf3_intent_messenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive_message);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE); //Получаем из интента сообщение с текстом. Методы для получения других данных есть на Android Developer
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(messageText); //Записать в TextView текст из полученного интента.
    }
}
