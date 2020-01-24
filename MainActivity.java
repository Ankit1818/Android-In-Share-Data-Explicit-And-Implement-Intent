package com.example.validaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText address, email, uname, password, contectnumber;
    Button submit;

    String addValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        address = findViewById(R.id.address);
        contectnumber = findViewById(R.id.number);
        email = findViewById(R.id.email);
        uname = findViewById(R.id.uname);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);

        ElseidDemo();


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValidatForm();



                /*Implicent Intent*/
                Intent i=new Intent(MainActivity.this,Main2Activity.class);

                i.putExtra("ankit",email.getText().toString());
                i.putExtra("uday",contectnumber.getText().toString());
                i.putExtra("nirav",uname.getText().toString());
                i.putExtra("raj",password.getText().toString());
                i.putExtra("ajay",address.getText().toString());
                startActivity(i);

               /* String url="https://www.javatpoint.com/android-share-app-data";
                Intent ii=new Intent(Intent.ACTION_SEND);
                ii.setType("text/plain");
                ii.putExtra(Intent.EXTRA_SUBJECT,"Intent Developer Info");
                ii.putExtra(android.content.Intent.EXTRA_TEXT,url);
                startActivity(Intent.createChooser(ii,"Ankit"));*/


               /*Explicent Intent*/
               Intent intent=new Intent(Intent.ACTION_SEND);
               intent.setType("text/plain");
               intent.putExtra(android.content.Intent.EXTRA_TEXT,email.getText().toString());
               startActivity(Intent.createChooser(intent,"Ankit Developer"));




               /* String shareBody = "https://www.javatpoint.com/android-share-app-data";
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent,"Developer"));
*/
            }
        });
    }



    void ValidatForm() {

        if (!email.getText().toString().trim().equals("")) {
            if (email.getText().toString().contains("@")) {
                Toast.makeText(this, email.getText(), Toast.LENGTH_SHORT).show();
            } else {
                email.setError("Not ValiEmail..");
            }
        }
        else {
            email.setError("Not Vali Input..");
        }

        if (!uname.getText().toString().trim().equals("")) {
            Toast.makeText(this, uname.getText().toString(), Toast.LENGTH_SHORT).show();
        } else {
            uname.setError("Enter Valid User Name");
        }
        if (!address.getText().toString().trim().equals(""))
        {
            Toast.makeText(this, address.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        else
        {
            address.setError("Please Enter Address");
        }
        if (!password.getText().toString().trim().equals(""))
        {
                if (password.getText().toString().length()>=4)
                {
                    Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    password.setError("Please Enter Password More Thane Chrecter 4");
                }
        }
        else
        {
                password.setError("Please Enter Password");
        }
        if (!contectnumber.getText().toString().trim().equals(""))
        {
            if (contectnumber.getText().toString().length()<10)
            {
                contectnumber.setError("Plese Enter 10 Digit");
            }
            else
            {
                Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            contectnumber.setError("Please Enter Text");
        }


    }


    void ElseidDemo() {

        String Tag = "my_Els";
        String name = "adsafdfsd";

        if (name.equals("krupal")) {
            Log.d(Tag, name);
        } else if (name.equals("mohit")) {
            Log.d(Tag, name);
        } else if (name.equals("ankit")) {
            Log.d(Tag, name);
        } else {
            Log.d(Tag, "we didnt find Name");
        }


    }


}
