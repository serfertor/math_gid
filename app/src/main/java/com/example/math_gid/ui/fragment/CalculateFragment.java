package com.example.math_gid.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.math_gid.R;

public class CalculateFragment extends Fragment {

    TextView user_input, sign_Box;

    Double num1, num2, answer;
    String sign, val_1, val_2;
    boolean has_Dot;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_calculate, container, false);

        user_input = (TextView) view.findViewById(R.id.input_user);
        sign_Box = (TextView) view.findViewById(R.id.sign_user);
        has_Dot = false;

        // Num events
        Button but0 = view.findViewById(R.id.btn_0);
        Button but1 = view.findViewById(R.id.btn_1);
        Button but2 = view.findViewById(R.id.btn_2);
        Button but3 = view.findViewById(R.id.btn_3);
        Button but4 = view.findViewById(R.id.btn_4);
        Button but5 = view.findViewById(R.id.btn_5);
        Button but6 = view.findViewById(R.id.btn_6);
        Button but7 = view.findViewById(R.id.btn_7);
        Button but8 = view.findViewById(R.id.btn_8);
        Button but9 = view.findViewById(R.id.btn_9);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText() + "0");
            }
        });
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText() + "1");
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText() + "2");
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText() + "3");
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText() + "4");
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText() + "5");
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText() + "6");
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText() + "7");
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText() + "8");
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(user_input.getText() + "9");
            }
        });


        // Operations events
        Button butDot = view.findViewById(R.id.btn_dot);
        Button butClear = view.findViewById(R.id.btn_clear);
        Button butSqrt = view.findViewById(R.id.btn_sqrt);
        Button butdiv = view.findViewById(R.id.btn_div);
        Button butMul = view.findViewById(R.id.btn_mul);
        Button butPlus = view.findViewById(R.id.btn_plus);
        Button butMin = view.findViewById(R.id.btn_min);
        Button butPow = view.findViewById(R.id.btn_pow);
        Button butEqu = view.findViewById(R.id.btn_equ);
        butDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!has_Dot) {
                    if (user_input.getText().equals("")) {

                        user_input.setText("0.");
                    } else {

                        user_input.setText(user_input.getText() + ".");
                    }

                    has_Dot = true;
                }
            }
        });
        butClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(null);
                sign_Box.setText(null);
                val_1 = null;
                val_2 = null;
                sign = null;
                has_Dot = false;
            }
        });
        butSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "root";
                user_input.setText(null);
                has_Dot = false;
                sign_Box.setText("√");
            }
        });
        butdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "/";
                val_1 = user_input.getText().toString();
                user_input.setText(null);
                sign_Box.setText("÷");
                has_Dot = false;
            }
        });
        butMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "*";
                val_1 = user_input.getText().toString();
                user_input.setText(null);
                sign_Box.setText("×");
                has_Dot = false;
            }
        });
        butPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "+";
                val_1 = user_input.getText().toString();
                user_input.setText(null);
                sign_Box.setText("+");
                has_Dot = false;
            }
        });
        butMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "-";
                val_1 = user_input.getText().toString();
                user_input.setText(null);
                sign_Box.setText("-");
                has_Dot = false;
            }
        });
        butPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "power";
                val_1 = user_input.getText().toString();
                user_input.setText(null);
                has_Dot = false;
                sign_Box.setText("xⁿ");
            }
        });
        butEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sign == null) {
                    sign_Box.setText("Error!");
                } else if (user_input.getText().equals("")) {
                    sign_Box.setText("Error!");
                } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && val_1.equals("")) {
                    sign_Box.setText("Error!");
                } else {
                    switch (sign) {
                        default:
                            break;
                        case "log":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            user_input.setText(Math.log10(num1) + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "ln":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            user_input.setText(Math.log(num1) + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "power":
                            num1 = Double.parseDouble((val_1));
                            val_2 = user_input.getText().toString();
                            num2 = Double.parseDouble(val_2);
                            user_input.setText(Math.pow(num1, num2) + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "root":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble((val_1));
                            user_input.setText(Math.sqrt(num1) + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "factorial":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble((val_1));
                            int i = Integer.parseInt(val_1) - 1;

                            while (i > 0) {
                                num1 = num1 * i;
                                i--;
                            }

                            user_input.setText(num1 + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "sin":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble((val_1));
                            user_input.setText(Math.sin(num1) + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "cos":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble((val_1));
                            user_input.setText(Math.cos(num1) + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "tan":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble((val_1));
                            user_input.setText(Math.tan(num1) + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "+":
                            val_2 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            num2 = Double.parseDouble(val_2);
                            answer = num1 + num2;
                            user_input.setText(answer + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "-":
                            val_2 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            num2 = Double.parseDouble(val_2);
                            answer = num1 - num2;
                            user_input.setText(answer + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "*":
                            val_2 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            num2 = Double.parseDouble(val_2);
                            answer = num1 * num2;
                            user_input.setText(answer + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                        case "/":
                            val_2 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            num2 = Double.parseDouble(val_2);
                            answer = num1 / num2;
                            user_input.setText(answer + "");
                            sign = null;
                            sign_Box.setText(null);
                            break;
                    }

                }
            }
        });
        return view;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                getActivity().onBackPressed();
                return true;
            default:
                getActivity().recreate();

        }
        return super.onOptionsItemSelected(item);
    }
}