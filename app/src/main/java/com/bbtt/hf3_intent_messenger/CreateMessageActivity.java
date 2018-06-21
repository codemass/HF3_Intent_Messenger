package com.bbtt.hf3_intent_messenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Вызвать onSendMessage() при щелчке на кнопке
    public void onSendMessage (View view) {
        EditText messageView = (EditText)findViewById(R.id.message);
        String messageText = messageView.getText().toString(); //Получаем текущий текст из EditText
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra (ReceiveMessageActivity.EXTRA_MESSAGE, messageText); //Отправляем с интентом сообщение с идентификатором EXTRA_MESSAGE с текстом из переменной messageText
        startActivity(intent); //Запускаем интент
    }
}
