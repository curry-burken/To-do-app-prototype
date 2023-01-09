package com.example.todoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.content.DialogInterface;
import android.widget.*;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.content.res.Resources;
public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);
        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox c4 = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox c5 = (CheckBox) findViewById(R.id.checkBox5);
        CheckBox c6 = (CheckBox) findViewById(R.id.checkBox6);
        CheckBox c7 = (CheckBox) findViewById(R.id.checkBox7);
        CheckBox c8 = (CheckBox) findViewById(R.id.checkBox8);
        CheckBox c9 = (CheckBox) findViewById(R.id.checkBox9);
        CheckBox c10 = (CheckBox) findViewById(R.id.checkBox10);
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        EditText e3 = (EditText) findViewById(R.id.editText3);
        EditText e4 = (EditText) findViewById(R.id.editText4);
        EditText e5 = (EditText) findViewById(R.id.editText5);
        EditText e6 = (EditText) findViewById(R.id.editText6);
        EditText e7 = (EditText) findViewById(R.id.editText7);
        EditText e8 = (EditText) findViewById(R.id.editText8);
        EditText e9 = (EditText) findViewById(R.id.editText9);
        EditText e10 = (EditText) findViewById(R.id.editText10);
        Button b1 = (Button) findViewById(R.id.button);
        int defaultcolor = this.getResources().getIdentifier("edit_text_border", "drawable", this.getPackageName());
        int changecolor = this.getResources().getIdentifier("task_done_colour", "drawable", this.getPackageName());
        c1.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                String textnull = e1.getText().toString();
                if (isChecked && !textnull.equals(""))
                {
                    e1.setBackgroundResource(changecolor);
                } else
                {
                    c1.setChecked(false);
                    e1.setBackgroundResource(defaultcolor);
                }
            }
        });
        c2.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                String textnull = e2.getText().toString();
                if (isChecked && !textnull.equals(""))
                {
                    e2.setBackgroundResource(changecolor);
                } else
                {
                    c2.setChecked(false);
                    e2.setBackgroundResource(defaultcolor);
                }
            }
        });
        c3.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                String textnull = e3.getText().toString();
                if (isChecked && !textnull.equals(""))
                {
                    e3.setBackgroundResource(changecolor);
                } else
                {
                    c3.setChecked(false);
                    e3.setBackgroundResource(defaultcolor);
                }
            }
        });
        c4.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                String textnull = e4.getText().toString();
                if (isChecked && !textnull.equals(""))
                {
                    e4.setBackgroundResource(changecolor);
                } else
                {
                    c4.setChecked(false);
                    e4.setBackgroundResource(defaultcolor);
                }
            }
        });
        c5.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                String textnull = e5.getText().toString();
                if (isChecked && !textnull.equals(""))
                {
                    e5.setBackgroundResource(changecolor);
                } else
                {
                    c5.setChecked(false);
                    e5.setBackgroundResource(defaultcolor);
                }
            }
        });
        c6.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                String textnull = e6.getText().toString();
                if (isChecked && !textnull.equals(""))
                {
                    e6.setBackgroundResource(changecolor);
                } else
                {
                    c6.setChecked(false);
                    e6.setBackgroundResource(defaultcolor);
                }
            }
        });
        c7.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                String textnull = e7.getText().toString();
                if (isChecked && !textnull.equals(""))
                {
                    e7.setBackgroundResource(changecolor);
                } else
                {
                    c7.setChecked(false);
                    e7.setBackgroundResource(defaultcolor);
                }
            }
        });
        c8.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                String textnull = e8.getText().toString();
                if (isChecked && !textnull.equals(""))
                {
                    e8.setBackgroundResource(changecolor);
                } else
                {
                    c8.setChecked(false);
                    e8.setBackgroundResource(defaultcolor);
                }
            }
        });
        c9.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                String textnull = e9.getText().toString();
                if (isChecked && !textnull.equals(""))
                {
                    e9.setBackgroundResource(changecolor);
                } else
                {
                    c9.setChecked(false);
                    e9.setBackgroundResource(defaultcolor);
                }
            }
        });
        c10.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                String textnull = e10.getText().toString();
                if (isChecked && !textnull.equals(""))
                {
                    e10.setBackgroundResource(changecolor);
                } else
                {
                    c10.setChecked(false);
                    e10.setBackgroundResource(defaultcolor);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setMessage("Are you sure you want to delete all your tasks?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                e1.setHint("Empty Task");
                                e1.setText("");
                                e1.setBackgroundResource(defaultcolor);
                                c1.setChecked(false);

                                e2.setHint("Empty Task");
                                e2.setText("");
                                e2.setBackgroundResource(defaultcolor);
                                c2.setChecked(false);

                                e3.setHint("Empty Task");
                                e3.setText("");
                                e3.setBackgroundResource(defaultcolor);
                                c3.setChecked(false);

                                e4.setHint("Empty Task");
                                e4.setText("");
                                e4.setBackgroundResource(defaultcolor);
                                c4.setChecked(false);

                                e5.setHint("Empty Task");
                                e5.setText("");
                                e5.setBackgroundResource(defaultcolor);
                                c5.setChecked(false);

                                e6.setHint("Empty Task");
                                e6.setText("");
                                e6.setBackgroundResource(defaultcolor);
                                c6.setChecked(false);

                                e7.setHint("Empty Task");
                                e7.setText("");
                                e7.setBackgroundResource(defaultcolor);
                                c7.setChecked(false);

                                e8.setHint("Empty Task");
                                e8.setText("");
                                e8.setBackgroundResource(defaultcolor);
                                c8.setChecked(false);

                                e9.setHint("Empty Task");
                                e9.setText("");
                                e9.setBackgroundResource(defaultcolor);
                                c9.setChecked(false);

                                e10.setHint("Empty Task");
                                e10.setText("");
                                e10.setBackgroundResource(defaultcolor);
                                c10.setChecked(false);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("Confirmation to reset");
                alert.show();
            }
        });
    }
}