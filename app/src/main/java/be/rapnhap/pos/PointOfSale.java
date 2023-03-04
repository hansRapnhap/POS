package be.rapnhap.pos;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class PointOfSale extends AppCompatActivity  {
    public int qtyA1 = 0;
    public int qtyA2 = 0;
    public int qtyA3 = 0;
    public int qtyA4 = 0;
    public int qtyA5 = 0;
    public int qtyA6 = 0;
    public int qtyA7 = 0;
    public int qtyA8 = 0;
    public int qtyI1 = 0;
    public int qtyI2 = 0;
    public int qtyI3 = 0;
    public int qtyI4 = 0;
    public int qtyI5 = 0;
    public int qtyI6 = 0;
    public int qtyI7 = 0;
    public int qtyK1 = 0;
    public int qtyK2 = 0;
    public int qtyK3 = 0;
    public int qtyK4 = 0;
    public int qtyK5 = 0;
    public int qtyK6 = 0;
    public int qtyT1 = 0;
    public int qtyT2 = 0;
    public int qtyT3 = 0;
    public int qtyB1 = 0;
    public int qtyB2 = 0;
    public int qtyB3 = 0;
    public int qtyB4 = 0;
    public int qtyB5 = 0;
    public int qtyB6 = 0;
    public int qtyB7 = 0;
    public int qtyB8 = 0;
    public int qtyV1 = 0;
    public int qtyF1 = 0;
    public int qtyF2 = 0;
    public int qtyF3 = 0;
    public int qtyF4 = 0;
    public int qtyF5 = 0;
    public int qtyF6 = 0;
    public int qtyF7 = 0;
    public int qtyF8 = 0;
    public int qtyF9 = 0;
    public int qtyW1 = 0;
    public int qtyW2 = 0;
    public int qtyW3 = 0;
    public int qtyW4 = 0;

    public BigDecimal priceA1;
    public BigDecimal priceA2;
    public BigDecimal priceA3;
    public BigDecimal priceA4;
    public BigDecimal priceA5;
    public BigDecimal priceA6;
    public BigDecimal priceA7;
    public BigDecimal priceA8;
    public BigDecimal priceI1;
    public BigDecimal priceI2;
    public BigDecimal priceI3;
    public BigDecimal priceI4;
    public BigDecimal priceI5;
    public BigDecimal priceI6;
    public BigDecimal priceI7;
    public BigDecimal priceK1;
    public BigDecimal priceK2;
    public BigDecimal priceK3;
    public BigDecimal priceK4;
    public BigDecimal priceK5;
    public BigDecimal priceK6;
    public BigDecimal priceT1;
    public BigDecimal priceT2;
    public BigDecimal priceT3;
    public BigDecimal priceB1;
    public BigDecimal priceB2;
    public BigDecimal priceB3;
    public BigDecimal priceB4;
    public BigDecimal priceB5;
    public BigDecimal priceB6;
    public BigDecimal priceB7;
    public BigDecimal priceB8;
    public BigDecimal priceV1;
    public BigDecimal priceF1;
    public BigDecimal priceF2;
    public BigDecimal priceF3;
    public BigDecimal priceF4;
    public BigDecimal priceF5;
    public BigDecimal priceF6;
    public BigDecimal priceF7;
    public BigDecimal priceF8;
    public BigDecimal priceF9;
    public BigDecimal priceW1;
    public BigDecimal priceW2;
    public BigDecimal priceW3;
    public BigDecimal priceW4;

    public BigDecimal amount;

    public TextView textA1;
    public TextView textA2;
    public TextView textA3;
    public TextView textA4;
    public TextView textA5;
    public TextView textA6;
    public TextView textA7;
    public TextView textA8;
    public TextView textI1;
    public TextView textI2;
    public TextView textI3;
    public TextView textI4;
    public TextView textI5;
    public TextView textI6;
    public TextView textI7;
    public TextView textK1;
    public TextView textK2;
    public TextView textK3;
    public TextView textK4;
    public TextView textK5;
    public TextView textK6;
    public TextView textT1;
    public TextView textT2;
    public TextView textT3;
    public TextView textB1;
    public TextView textB2;
    public TextView textB3;
    public TextView textB4;
    public TextView textB5;
    public TextView textB6;
    public TextView textB7;
    public TextView textB8;
    public TextView textV1;
    public TextView textF1;
    public TextView textF2;
    public TextView textF3;
    public TextView textF4;
    public TextView textF5;
    public TextView textF6;
    public TextView textF7;
    public TextView textF8;
    public TextView textF9;
    public TextView textW1;
    public TextView textW2;
    public TextView textW3;
    public TextView textW4;

    public String labelA1 = "A bieslook";
    public String labelA2 = "A rozemarijn ";
    public String labelA3 = "A gorgonzola";
    public String labelA4 = "A olijven";
    public String labelA5 = "A gerookte ham";
    public String labelA6 = "A chorizzo";
    public String labelA7 = "A kippengehakt";
    public String labelA8 = "A gerookte zalm";
    public String labelB1 = "B champignons";
    public String labelB2 = "B courgette";
    public String labelB3 = "B gehakt";
    public String labelB4 = "B gerookte ham";
    public String labelB5 = "B appel";
    public String labelB6 = "B chocolade";
    public String labelB7 = "B kokos";
    public String labelB8 = "Orangette";
    public String labelV1 = "Vanille";
    public String labelI1 = "Magnum";
    public String labelI2 = "Cornet d'amour";
    public String labelI3 = "Maxi vanille";
    public String labelI4 = "Satelite";
    public String labelI5 = "Pot Vanille";
    public String labelI6 = "Pot Chocol.";
    public String labelI7 = "Pot aardbei";
    public String labelF1 = "Coca-Cola";
    public String labelF2 = "Cola zero";
    public String labelF3 = "Ice - Tea";
    public String labelF4 = "Fanta";
    public String labelF5 = "Appelsap";
    public String labelF6 = "Sinaas sap";
    public String labelF7 = "Cecemel";
    public String labelF8 = "Plat water";
    public String labelF9 = "Spuitwater";
    public String labelK1 = "Expresso";
    public String labelK2 = "Expresso melk";
    public String labelK3 = "Lungo";
    public String labelK4 = "Lungo melk";
    public String labelK5 = "Deca";
    public String labelK6 = "Deca melk";
    public String labelT1 = "Yellow label";
    public String labelT2 = "Green tea";
    public String labelT3 = "Rozenbottel";
    public String labelW1 = "Jupiler";
    public String labelW2 = "Wijn, W/Rz/R";
    public String labelW3 = "Mocktail";
    public String labelW4 = "Mojito";
    public String labelD1 = "Pannacotta";
    public String labelD2 = "Chocolademousse";

    public String line = "";

    public int sequenceNumber;

    public TextView textAmount;

    public boolean printBusy = true;

    // used to get folder on SD card to save the csv
    public File pathHandle;

    protected ProgressDialog mProgressDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_of_sale);

        String seqHhmm = new SimpleDateFormat("HHmm").format(Calendar.getInstance().getTime());
        int i = Integer. parseInt(seqHhmm);
        sequenceNumber = i * 10000;
        printBusy = false;

        // get name of SD card folder
        File[] externalFilesDirs = new File[1];
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            externalFilesDirs = this.getExternalFilesDirs("external");
        }
        pathHandle = externalFilesDirs[1];
        // (will be used in SaveRequest)

        // RUN LONG PROCESS IN SEPARATE FUNCTION
        runLongProcess(this);
    }


        // HERE STARTS THE LOG PROCESS
        private void runLongProcess(Context mcontext) {
            mProgressDialog = ProgressDialog.show(this, "Please wait","Long operation starts...", true);
            new Thread() {
                @Override
                public void run() {



        textA1 = findViewById(R.id.textA1);
        textA2 = findViewById(R.id.textA2);
        textA3 = findViewById(R.id.textA3);
        textA4 = findViewById(R.id.textA4);
        textA5 = findViewById(R.id.textA5);
        textA6 = findViewById(R.id.textA6);
        textA7 = findViewById(R.id.textA7);
        textA8 = findViewById(R.id.textA8);
        textI1 = findViewById(R.id.textI1);
        textI2 = findViewById(R.id.textI2);
        textI3 = findViewById(R.id.textI3);
        textI4 = findViewById(R.id.textI4);
        textI5 = findViewById(R.id.textI5);
        textI6 = findViewById(R.id.textI6);
        textI7 = findViewById(R.id.textI7);
        textK1 = findViewById(R.id.textK1);
        textK2 = findViewById(R.id.textK2);
        textK3 = findViewById(R.id.textK3);
        textK4 = findViewById(R.id.textK4);
        textK5 = findViewById(R.id.textK5);
        textK6 = findViewById(R.id.textK6);
        textT1 = findViewById(R.id.textT1);
        textT2 = findViewById(R.id.textT2);
        textT3 = findViewById(R.id.textT3);
        textB1 = findViewById(R.id.textB1);
        textB2 = findViewById(R.id.textB2);
        textB3 = findViewById(R.id.textB3);
        textB4 = findViewById(R.id.textB4);
        textB5 = findViewById(R.id.textB5);
        textB6 = findViewById(R.id.textB6);
        textB7 = findViewById(R.id.textB7);
        textB8 = findViewById(R.id.textB8);
        textV1 = findViewById(R.id.textV1);
        textF1 = findViewById(R.id.textF1);
        textF2 = findViewById(R.id.textF2);
        textF3 = findViewById(R.id.textF3);
        textF4 = findViewById(R.id.textF4);
        textF5 = findViewById(R.id.textF5);
        textF6 = findViewById(R.id.textF6);
        textF7 = findViewById(R.id.textF7);
        textF8 = findViewById(R.id.textF8);
        textF9 = findViewById(R.id.textF9);
        textW1 = findViewById(R.id.textW1);
        textW2 = findViewById(R.id.textW2);
        textW3 = findViewById(R.id.textW3);
        textW4 = findViewById(R.id.textW4);

        textAmount = findViewById(R.id.textAmount);

        Button butA1 = (Button) findViewById(R.id.butA1);
        Button butA2 = (Button) findViewById(R.id.butA2);
        Button butA3 = (Button) findViewById(R.id.butA3);
        Button butA4 = (Button) findViewById(R.id.butA4);
        Button butA5 = (Button) findViewById(R.id.butA5);
        Button butA6 = (Button) findViewById(R.id.butA6);
        Button butA7 = (Button) findViewById(R.id.butA7);
        Button butA8 = (Button) findViewById(R.id.butA8);
        Button butI1 = (Button) findViewById(R.id.butI1);
        Button butI2 = (Button) findViewById(R.id.butI2);
        Button butI3 = (Button) findViewById(R.id.butI3);
        Button butI4 = (Button) findViewById(R.id.butI4);
        Button butI5 = (Button) findViewById(R.id.butI5);
        Button butI6 = (Button) findViewById(R.id.butI6);
        Button butI7 = (Button) findViewById(R.id.butI7);
        Button butK1 = (Button) findViewById(R.id.butK1);
        Button butK2 = (Button) findViewById(R.id.butK2);
        Button butK3 = (Button) findViewById(R.id.butK3);
        Button butK4 = (Button) findViewById(R.id.butK4);
        Button butK5 = (Button) findViewById(R.id.butK5);
        Button butK6 = (Button) findViewById(R.id.butK6);
        Button butT1 = (Button) findViewById(R.id.butT1);
        Button butT2 = (Button) findViewById(R.id.butT2);
        Button butT3 = (Button) findViewById(R.id.butT3);
        Button butB1 = (Button) findViewById(R.id.butB1);
        Button butB2 = (Button) findViewById(R.id.butB2);
        Button butB3 = (Button) findViewById(R.id.butB3);
        Button butB4 = (Button) findViewById(R.id.butB4);
        Button butB5 = (Button) findViewById(R.id.butB5);
        Button butB6 = (Button) findViewById(R.id.butB6);
        Button butB7 = (Button) findViewById(R.id.butB7);
        Button butB8 = (Button) findViewById(R.id.butB8);
        Button butV1 = (Button) findViewById(R.id.butV1);
        Button butF1 = (Button) findViewById(R.id.butF1);
        Button butF2 = (Button) findViewById(R.id.butF2);
        Button butF3 = (Button) findViewById(R.id.butF3);
        Button butF4 = (Button) findViewById(R.id.butF4);
        Button butF5 = (Button) findViewById(R.id.butF5);
        Button butF6 = (Button) findViewById(R.id.butF6);
        Button butF7 = (Button) findViewById(R.id.butF7);
        Button butF8 = (Button) findViewById(R.id.butF8);
        Button butF9 = (Button) findViewById(R.id.butF9);
        Button butW1 = (Button) findViewById(R.id.butW1);
        Button butW2 = (Button) findViewById(R.id.butW2);
        Button butW3 = (Button) findViewById(R.id.butW3);
        Button butW4 = (Button) findViewById(R.id.butW4);

        Button butMinA1 = (Button) findViewById(R.id.butminA1);
        Button butMinA2 = (Button) findViewById(R.id.butminA2);
        Button butMinA3 = (Button) findViewById(R.id.butminA3);
        Button butMinA4 = (Button) findViewById(R.id.butminA4);
        Button butMinA5 = (Button) findViewById(R.id.butminA5);
        Button butMinA6 = (Button) findViewById(R.id.butminA6);
        Button butMinA7 = (Button) findViewById(R.id.butminA7);
        Button butMinA8 = (Button) findViewById(R.id.butminA8);
        Button butMinI1 = (Button) findViewById(R.id.butminI1);
        Button butMinI2 = (Button) findViewById(R.id.butminI2);
        Button butMinI3 = (Button) findViewById(R.id.butminI3);
        Button butMinI4 = (Button) findViewById(R.id.butminI4);
        Button butMinI5 = (Button) findViewById(R.id.butminI5);
        Button butMinI6 = (Button) findViewById(R.id.butminI6);
        Button butMinI7 = (Button) findViewById(R.id.butminI7);
        Button butMinK1 = (Button) findViewById(R.id.butminK1);
        Button butMinK2 = (Button) findViewById(R.id.butminK2);
        Button butMinK3 = (Button) findViewById(R.id.butminK3);
        Button butMinK4 = (Button) findViewById(R.id.butminK4);
        Button butMinK5 = (Button) findViewById(R.id.butminK5);
        Button butMinK6 = (Button) findViewById(R.id.butminK6);
        Button butMinT1 = (Button) findViewById(R.id.butminT1);
        Button butMinT2 = (Button) findViewById(R.id.butminT2);
        Button butMinT3 = (Button) findViewById(R.id.butminT3);
        Button butMinB1 = (Button) findViewById(R.id.butminB1);
        Button butMinB2 = (Button) findViewById(R.id.butminB2);
        Button butMinB3 = (Button) findViewById(R.id.butminB3);
        Button butMinB4 = (Button) findViewById(R.id.butminB4);
        Button butMinB5 = (Button) findViewById(R.id.butminB5);
        Button butMinB6 = (Button) findViewById(R.id.butminB6);
        Button butMinB7 = (Button) findViewById(R.id.butminB7);
        Button butMinB8 = (Button) findViewById(R.id.butminB8);
        Button butMinV1 = (Button) findViewById(R.id.butminV1);
        Button butMinF1 = (Button) findViewById(R.id.butminF1);
        Button butMinF2 = (Button) findViewById(R.id.butminF2);
        Button butMinF3 = (Button) findViewById(R.id.butminF3);
        Button butMinF4 = (Button) findViewById(R.id.butminF4);
        Button butMinF5 = (Button) findViewById(R.id.butminF5);
        Button butMinF6 = (Button) findViewById(R.id.butminF6);
        Button butMinF7 = (Button) findViewById(R.id.butminF7);
        Button butMinF8 = (Button) findViewById(R.id.butminF8);
        Button butMinF9 = (Button) findViewById(R.id.butminF9);
        Button butMinW1 = (Button) findViewById(R.id.butminW1);
        Button butMinW2 = (Button) findViewById(R.id.butminW2);
        Button butMinW3 = (Button) findViewById(R.id.butminW3);
        Button butMinW4 = (Button) findViewById(R.id.butminW4);

        // INITIALIZE --------------------------------------------------------------------
        initializeQty();
        loadData();

        // A1
        butA1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyA1 = qtyA1 + 1;
                amount = amount.add(priceA1);
                loadData();
            }
        });

        butMinA1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyA1 > 0) {
                    qtyA1 = qtyA1 - 1;
                    amount = amount.subtract(priceA1);
                    loadData();
                }
            }
        });

        // A2
        butA2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyA2 = qtyA2 + 1;
                amount = amount.add(priceA2);
                loadData();
            }
        });

        butMinA2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyA2 > 0) {
                    qtyA2 = qtyA2 - 1;
                    amount = amount.subtract(priceA2);
                    loadData();
                }
            }
        });

        // A3
        butA3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyA3 = qtyA3 + 1;
                amount = amount.add(priceA3);
                loadData();
            }
        });

        butMinA3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyA3 > 0) {
                    qtyA3 = qtyA3 - 1;
                    amount = amount.subtract(priceA3);
                    loadData();
                }
            }
        });

        // A4
        butA4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyA4 = qtyA4 + 1;
                amount = amount.add(priceA4);
                loadData();
            }
        });

        butMinA4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyA4 > 0) {
                    qtyA4 = qtyA4 - 1;
                    amount = amount.subtract(priceA4);
                    loadData();
                }
            }
        });

        // A5
        butA5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyA5 = qtyA5 + 1;
                amount = amount.add(priceA5);
                loadData();
            }
        });

        butMinA5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyA5 > 0) {
                    qtyA5 = qtyA5 - 1;
                    amount = amount.subtract(priceA5);
                    loadData();
                }
            }
        });

        // A6
        butA6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyA6 = qtyA6 + 1;
                amount = amount.add(priceA6);
                loadData();
            }
        });

        butMinA6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyA6 > 0) {
                    qtyA6 = qtyA6 - 1;
                    amount = amount.subtract(priceA6);
                    loadData();
                }
            }
        });

        // A7
        butA7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyA7 = qtyA7 + 1;
                amount = amount.add(priceA7);
                loadData();
            }
        });

        butMinA7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyA7 > 0) {
                    qtyA7 = qtyA7 - 1;
                    amount = amount.subtract(priceA7);
                    loadData();
                }
            }
        });

        // A8
        butA8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyA8 = qtyA8 + 1;
                amount = amount.add(priceA8);
                loadData();
            }
        });

        butMinA8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyA8 > 0) {
                    qtyA8 = qtyA8 - 1;
                    amount = amount.subtract(priceA8);
                    loadData();
                }
            }
        });

        // I1
        butI1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyI1 = qtyI1 + 1;
                amount = amount.add(priceI1);
                loadData();
            }
        });

        butMinI1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyI1 > 0) {
                    qtyI1 = qtyI1 - 1;
                    amount = amount.subtract(priceI1);
                    loadData();
                }
            }
        });

        // I2
        butI2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyI2 = qtyI2 + 1;
                amount = amount.add(priceI2);
                loadData();
            }
        });

        butMinI2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyI2 > 0) {
                    qtyI2 = qtyI2 - 1;
                    amount = amount.subtract(priceI2);
                    loadData();
                }
            }
        });

        // I3
        butI3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyI3 = qtyI3 + 1;
                amount = amount.add(priceI3);
                loadData();
            }
        });

        butMinI3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyI3 > 0) {
                    qtyI3 = qtyI3 - 1;
                    amount = amount.subtract(priceI3);
                    loadData();
                }
            }
        });

        // I4
        butI4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyI4 = qtyI4 + 1;
                amount = amount.add(priceI4);
                loadData();
            }
        });

        butMinI4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyI4 > 0) {
                    qtyI4 = qtyI4 - 1;
                    amount = amount.subtract(priceI4);
                    loadData();
                }
            }
        });

        // I5
        butI5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyI5 = qtyI5 + 1;
                amount = amount.add(priceI5);
                loadData();
            }
        });

        butMinI5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyI5 > 0) {
                    qtyI5 = qtyI5 - 1;
                    amount = amount.subtract(priceI5);
                    loadData();
                }
            }
        });

        // I6
        butI6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyI6 = qtyI6 + 1;
                amount = amount.add(priceI6);
                loadData();
            }
        });

        butMinI6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyI6 > 0) {
                    qtyI6 = qtyI6 - 1;
                    amount = amount.subtract(priceI6);
                    loadData();
                }
            }
        });

        // I7
        butI7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyI7 = qtyI7 + 1;
                amount = amount.add(priceI7);
                loadData();
            }
        });

        butMinI7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyI7 > 0) {
                    qtyI7 = qtyI7 - 1;
                    amount = amount.subtract(priceI7);
                    loadData();
                }
            }
        });




        // K1
        butK1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyK1 = qtyK1 + 1;
                amount = amount.add(priceK1);
                loadData();
            }
        });

        butMinK1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyK1 > 0) {
                    qtyK1 = qtyK1 - 1;
                    amount = amount.subtract(priceK1);
                    loadData();
                }
            }
        });

        // K2
        butK2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyK2 = qtyK2 + 1;
                amount = amount.add(priceK2);
                loadData();
            }
        });

        butMinK2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyK2 > 0) {
                    qtyK2 = qtyK2 - 1;
                    amount = amount.subtract(priceK2);
                    loadData();
                }
            }
        });

        // K3
        butK3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyK3 = qtyK3 + 1;
                amount = amount.add(priceK3);
                loadData();
            }
        });

        butMinK3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyK3 > 0) {
                    qtyK3 = qtyK3 - 1;
                    amount = amount.subtract(priceK3);
                    loadData();
                }
            }
        });

        // K4
        butK4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyK4 = qtyK4 + 1;
                amount = amount.add(priceK4);
                loadData();
            }
        });

        butMinK4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyK4 > 0) {
                    qtyK4 = qtyK4 - 1;
                    amount = amount.subtract(priceK4);
                    loadData();
                }
            }
        });

        // K5
        butK5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyK5 = qtyK5 + 1;
                amount = amount.add(priceK5);
                loadData();
            }
        });

        butMinK5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyK5 > 0) {
                    qtyK5 = qtyK5 - 1;
                    amount = amount.subtract(priceK5);
                    loadData();
                }
            }
        });

        // K6
        butK6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyK6 = qtyK6 + 1;
                amount = amount.add(priceK6);
                loadData();
            }
        });

        butMinK6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyK6 > 0) {
                    qtyK6 = qtyK6 - 1;
                    amount = amount.subtract(priceK6);
                    loadData();
                }
            }
        });

        // T1
        butT1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyT1 = qtyT1 + 1;
                amount = amount.add(priceT1);
                loadData();
            }
        });

        butMinT1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyT1 > 0) {
                    qtyT1 = qtyT1 - 1;
                    amount = amount.subtract(priceT1);
                    loadData();
                }
            }
        });

        // T2
        butT2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyT2 = qtyT2 + 1;
                amount = amount.add(priceT2);
                loadData();
            }
        });

        butMinT2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyT2 > 0) {
                    qtyT2 = qtyT2 - 1;
                    amount = amount.subtract(priceT2);
                    loadData();
                }
            }
        });

        // T3
        butT3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyT3 = qtyT3 + 1;
                amount = amount.add(priceT3);
                loadData();
            }
        });

        butMinT3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyT3 > 0) {
                    qtyT3 = qtyT3 - 1;
                    amount = amount.subtract(priceT3);
                    loadData();
                }
            }
        });

        // B1
        butB1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyB1 = qtyB1 + 1;
                amount = amount.add(priceB1);
                loadData();
            }
        });

        butMinB1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyB1 > 0) {
                    qtyB1 = qtyB1 - 1;
                    amount = amount.subtract(priceB1);
                    loadData();
                }
            }
        });

        // B2
        butB2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyB2 = qtyB2 + 1;
                amount = amount.add(priceB2);
                loadData();
            }
        });

        butMinB2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyB2 > 0) {
                    qtyB2 = qtyB2 - 1;
                    amount = amount.subtract(priceB2);
                    loadData();
                }
            }
        });

        // B3
        butB3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyB3 = qtyB3 + 1;
                amount = amount.add(priceB3);
                loadData();
            }
        });

        butMinB3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyB3 > 0) {
                    qtyB3 = qtyB3 - 1;
                    amount = amount.subtract(priceB3);
                    loadData();
                }
            }
        });

        // B4
        butB4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyB4 = qtyB4 + 1;
                amount = amount.add(priceB4);
                loadData();
            }
        });

        butMinB4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyB4 > 0) {
                    qtyB4 = qtyB4 - 1;
                    amount = amount.subtract(priceB4);
                    loadData();
                }
            }
        });

        // B5
        butB5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyB5 = qtyB5 + 1;
                amount = amount.add(priceB5);
                loadData();
            }
        });

        butMinB5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyB5 > 0) {
                    qtyB5 = qtyB5 - 1;
                    amount = amount.subtract(priceB5);
                    loadData();
                }
            }
        });

        // B6
        butB6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyB6 = qtyB6 + 1;
                amount = amount.add(priceB6);
                loadData();
            }
        });

        butMinB6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyB6 > 0) {
                    qtyB6 = qtyB6 - 1;
                    amount = amount.subtract(priceB6);
                    loadData();
                }
            }
        });

        // B7
        butB7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyB7 = qtyB7 + 1;
                amount = amount.add(priceB7);
                loadData();
            }
        });

        butMinB7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyB7 > 0) {
                    qtyB7 = qtyB7 - 1;
                    amount = amount.subtract(priceB7);
                    loadData();
                }
            }
        });

        // B8
        butB8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyB8 = qtyB8 + 1;
                amount = amount.add(priceB8);
                loadData();
            }
        });

        butMinB8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyB8 > 0) {
                    qtyB8 = qtyB8 - 1;
                    amount = amount.subtract(priceB8);
                    loadData();
                }
            }
        });


        // V1
        butV1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyV1 = qtyV1 + 1;
                amount = amount.add(priceV1);
                loadData();
            }
        });

        butMinV1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyV1 > 0) {
                    qtyV1 = qtyV1 - 1;
                    amount = amount.subtract(priceV1);
                    loadData();
                }
            }
        });

        // F1
        butF1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyF1 = qtyF1 + 1;
                amount = amount.add(priceF1);
                loadData();
            }
        });

        butMinF1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyF1 > 0) {
                    qtyF1 = qtyF1 - 1;
                    amount = amount.subtract(priceF1);
                    loadData();
                }
            }
        });

        // F2
        butF2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyF2 = qtyF2 + 1;
                amount = amount.add(priceF2);
                loadData();
            }
        });

        butMinF2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyF2 > 0) {
                    qtyF2 = qtyF2 - 1;
                    amount = amount.subtract(priceF2);
                    loadData();
                }
            }
        });

        // F3
        butF3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyF3 = qtyF3 + 1;
                amount = amount.add(priceF3);
                loadData();
            }
        });

        butMinF3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyF3 > 0) {
                    qtyF3 = qtyF3 - 1;
                    amount = amount.subtract(priceF3);
                    loadData();
                }
            }
        });

        // F4
        butF4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyF4 = qtyF4 + 1;
                amount = amount.add(priceF4);
                loadData();
            }
        });

        butMinF4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyF4 > 0) {
                    qtyF4 = qtyF4 - 1;
                    amount = amount.subtract(priceF4);
                    loadData();
                }
            }
        });

        // F5
        butF5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyF5 = qtyF5 + 1;
                amount = amount.add(priceF5);
                loadData();
            }
        });

        butMinF5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyF5 > 0) {
                    qtyF5 = qtyF5 - 1;
                    amount = amount.subtract(priceF5);
                    loadData();
                }
            }
        });

        // F6
        butF6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyF6 = qtyF6 + 1;
                amount = amount.add(priceF6);
                loadData();
            }
        });

        butMinF6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyF6 > 0) {
                    qtyF6 = qtyF6 - 1;
                    amount = amount.subtract(priceF6);
                    loadData();
                }
            }
        });

        // F7
        butF7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyF7 = qtyF7 + 1;
                amount = amount.add(priceF7);
                loadData();
            }
        });

        butMinF7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyF7 > 0) {
                    qtyF7 = qtyF7 - 1;
                    amount = amount.subtract(priceF7);
                    loadData();
                }
            }
        });

        // F8
        butF8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyF8 = qtyF8 + 1;
                amount = amount.add(priceF8);
                loadData();
            }
        });

        butMinF8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyF8 > 0) {
                    qtyF8 = qtyF8 - 1;
                    amount = amount.subtract(priceF8);
                    loadData();
                }
            }
        });

        // F9
        butF9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyF9 = qtyF9 + 1;
                amount = amount.add(priceF9);
                loadData();
            }
        });

        butMinF9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyF9 > 0) {
                    qtyF9 = qtyF9 - 1;
                    amount = amount.subtract(priceF9);
                    loadData();
                }
            }
        });

        // W1
        butW1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyW1 = qtyW1 + 1;
                amount = amount.add(priceW1);
                loadData();
            }
        });

        butMinW1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyW1 > 0) {
                    qtyW1 = qtyW1 - 1;
                    amount = amount.subtract(priceW1);
                    loadData();
                }
            }
        });
        // W2
        butW2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyW2 = qtyW2 + 1;
                amount = amount.add(priceW2);
                loadData();
            }
        });

        butMinW2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyW2 > 0) {
                    qtyW2 = qtyW2 - 1;
                    amount = amount.subtract(priceW2);
                    loadData();
                }
            }
        });

        // W3
        butW3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyW3 = qtyW3 + 1;
                amount = amount.add(priceW3);
                loadData();
            }
        });

        butMinW3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyW3 > 0) {
                    qtyW3 = qtyW3 - 1;
                    amount = amount.subtract(priceW3);
                    loadData();
                }
            }
        });

        // W4
        butW4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                qtyW4 = qtyW4 + 1;
                amount = amount.add(priceW4);
                loadData();
            }
        });

        butMinW4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qtyW4 > 0) {
                    qtyW4 = qtyW4 - 1;
                    amount = amount.subtract(priceW4);
                    loadData();
                }
            }
        });

        // Reset
        Button butReset = (Button) findViewById(R.id.butReset);
        butReset.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                initializeQty();
                loadData();
            }
        });


        // Print
        Button butPrint = (Button) findViewById(R.id.butPrint);
        butPrint.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // save the data (only when something is entered)
                if (amount.doubleValue() != 0) {
                    String data = parseSaveData();
                    SaveRequest.saveData(data,pathHandle);
                }

                // decide print action
                Boolean printIsNeeded;
                String sequence;
                if (amount.doubleValue() != 0) {
                    printIsNeeded = true;
                    sequence = String.format("%8d", sequenceNumber);
                    // build the 'line' to print
                    line = parsePrintLines();
                } else {
                    printIsNeeded = false;
                    sequence = "";
                    line = "Er is niets te printen !";
                }


                // print in separate activity to avoid multiple click of button (occurred using showDialog)
                Intent intentPrint = new Intent(PointOfSale.this,PrintDialog.class);
                intentPrint.putExtra("printIsNeeded", printIsNeeded);
                intentPrint.putExtra("sequence", sequence);
                intentPrint.putExtra("line", line);
                startActivity(intentPrint);

                // REMARK: we set to 0  here (data are saved,
                //  and parsed in 'line' to enable reprint in separate activity)
                // reset the panel to 0
                initializeQty();
                loadData();

            }
        });

    }

    String parsePrintLines()  {
        // helper field for line amount (only calculated on the printout)
        BigDecimal amountLine;
        // String.format("%5.2f", amountLine) returns ' 0.01' (5 positions, 2 leading , decimal sign, 2 decimals)

        String line = "";
        if (qtyA1 > 0) {
            line += String.format("%1$2s", qtyA1) + " ";
            line += String.format("%-15s", labelA1) + " ";
            amountLine = BigDecimal.valueOf(qtyA1).multiply(priceA1);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyA2 > 0) {
            line += String.format("%1$2s", qtyA2) + " ";
            line += String.format("%-15s", labelA2) + " ";
            amountLine = BigDecimal.valueOf(qtyA2).multiply(priceA2);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyA3 > 0) {
            line += String.format("%1$2s", qtyA3) + " ";
            line += String.format("%-15s", labelA3) + " ";
            amountLine = BigDecimal.valueOf(qtyA3).multiply(priceA3);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyA4 > 0) {
            line += String.format("%1$2s", qtyA4) + " ";
            line += String.format("%-15s", labelA4) + " ";
            amountLine = BigDecimal.valueOf(qtyA4).multiply(priceA4);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyA5 > 0) {
            line += String.format("%1$2s", qtyA5) + " ";
            line += String.format("%-15s", labelA5) + " ";
            amountLine = BigDecimal.valueOf(qtyA5).multiply(priceA5);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyA6 > 0) {
            line += String.format("%1$2s", qtyA6) + " ";
            line += String.format("%-15s", labelA6) + " ";
            amountLine = BigDecimal.valueOf(qtyA6).multiply(priceA6);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyA7 > 0) {
            line += String.format("%1$2s", qtyA7) + " ";
            line += String.format("%-15s", labelA7) + " ";
            amountLine = BigDecimal.valueOf(qtyA7).multiply(priceA7);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyA8 > 0) {
            line += String.format("%1$2s", qtyA8) + " ";
            line += String.format("%-15s", labelA8) + " ";
            amountLine = BigDecimal.valueOf(qtyA8).multiply(priceA8);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyB1 > 0) {
            line += String.format("%1$2s", qtyB1) + " ";
            line += String.format("%-15s", labelB1) + " ";
            amountLine = BigDecimal.valueOf(qtyB1).multiply(priceB1);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyB2 > 0) {
            line += String.format("%1$2s", qtyB2) + " ";
            line += String.format("%-15s", labelB2) + " ";
            amountLine = BigDecimal.valueOf(qtyB2).multiply(priceB2);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyB3 > 0) {
            line += String.format("%1$2s", qtyB3) + " ";
            line += String.format("%-15s", labelB3) + " ";
            amountLine = BigDecimal.valueOf(qtyB3).multiply(priceB3);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyB4 > 0) {
            line += String.format("%1$2s", qtyB4) + " ";
            line += String.format("%-15s", labelB4) + " ";
            amountLine = BigDecimal.valueOf(qtyB4).multiply(priceB4);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyB5 > 0) {
            line += String.format("%1$2s", qtyB5) + " ";
            line += String.format("%-15s", labelB5) + " ";
            amountLine = BigDecimal.valueOf(qtyB5).multiply(priceB5);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyB6 > 0) {
            line += String.format("%1$2s", qtyB6) + " ";
            line += String.format("%-15s", labelB6) + " ";
            amountLine = BigDecimal.valueOf(qtyB6).multiply(priceB6);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyB7 > 0) {
            line += String.format("%1$2s", qtyB7) + " ";
            line += String.format("%-15s", labelB7) + " ";
            amountLine = BigDecimal.valueOf(qtyB7).multiply(priceB7);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyB8 > 0) {
            line += String.format("%1$2s", qtyB8) + " ";
            line += String.format("%-15s", labelB8) + " ";
            amountLine = BigDecimal.valueOf(qtyB8).multiply(priceB8);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyV1 > 0) {
            line += String.format("%1$2s", qtyV1) + " ";
            line += String.format("%-15s", labelV1) + " ";
            amountLine = BigDecimal.valueOf(qtyV1).multiply(priceV1);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyI1 > 0) {
            line += String.format("%1$2s", qtyI1) + " ";
            line += String.format("%-15s", labelI1) + " ";
            amountLine = BigDecimal.valueOf(qtyI1).multiply(priceI1);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyI2 > 0) {
            line += String.format("%1$2s", qtyI2) + " ";
            line += String.format("%-15s", labelI2) + " ";
            amountLine = BigDecimal.valueOf(qtyI2).multiply(priceI2);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyI3 > 0) {
            line += String.format("%1$2s", qtyI3) + " ";
            line += String.format("%-15s", labelI3) + " ";
            amountLine = BigDecimal.valueOf(qtyI3).multiply(priceI3);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyI4 > 0) {
            line += String.format("%1$2s", qtyI4) + " ";
            line += String.format("%-15s", labelI4) + " ";
            amountLine = BigDecimal.valueOf(qtyI4).multiply(priceI4);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyI5 > 0) {
            line += String.format("%1$2s", qtyI5) + " ";
            line += String.format("%-15s", labelI5) + " ";
            amountLine = BigDecimal.valueOf(qtyI5).multiply(priceI5);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyI6 > 0) {
            line += String.format("%1$2s", qtyI6) + " ";
            line += String.format("%-15s", labelI6) + " ";
            amountLine = BigDecimal.valueOf(qtyI6).multiply(priceI6);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyI7 > 0) {
            line += String.format("%1$2s", qtyI7) + " ";
            line += String.format("%-15s", labelI7) + " ";
            amountLine = BigDecimal.valueOf(qtyI7).multiply(priceI7);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyK1 > 0) {
            line += String.format("%1$2s", qtyK1) + " ";
            line += String.format("%-15s", labelK1) + " ";
            amountLine = BigDecimal.valueOf(qtyK1).multiply(priceK1);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyK2 > 0) {
            line += String.format("%1$2s", qtyK2) + " ";
            line += String.format("%-15s", labelK2) + " ";
            amountLine = BigDecimal.valueOf(qtyK2).multiply(priceK2);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyK3 > 0) {
            line += String.format("%1$2s", qtyK3) + " ";
            line += String.format("%-15s", labelK3) + " ";
            amountLine = BigDecimal.valueOf(qtyK3).multiply(priceK3);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyK4 > 0) {
            line += String.format("%1$2s", qtyK4) + " ";
            line += String.format("%-15s", labelK4) + " ";
            amountLine = BigDecimal.valueOf(qtyK4).multiply(priceK4);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyK5 > 0) {
            line += String.format("%1$2s", qtyK5) + " ";
            line += String.format("%-15s", labelK5) + " ";
            amountLine = BigDecimal.valueOf(qtyK5).multiply(priceK5);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyK6 > 0) {
            line += String.format("%1$2s", qtyK6) + " ";
            line += String.format("%-15s", labelK6) + " ";
            amountLine = BigDecimal.valueOf(qtyK6).multiply(priceK6);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyT1 > 0) {
            line += String.format("%1$2s", qtyT1) + " ";
            line += String.format("%-15s", labelT1) + " ";
            amountLine = BigDecimal.valueOf(qtyT1).multiply(priceT1);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyT2 > 0) {
            line += String.format("%1$2s", qtyT2) + " ";
            line += String.format("%-15s", labelT2) + " ";
            amountLine = BigDecimal.valueOf(qtyT2).multiply(priceT2);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyT3 > 0) {
            line += String.format("%1$2s", qtyT3) + " ";
            line += String.format("%-15s", labelT3) + " ";
            amountLine = BigDecimal.valueOf(qtyT3).multiply(priceT3);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyF1 > 0) {
            line += String.format("%1$2s", qtyF1) + " ";
            line += String.format("%-15s", labelF1) + " ";
            amountLine = BigDecimal.valueOf(qtyF1).multiply(priceF1);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyF2 > 0) {
            line += String.format("%1$2s", qtyF2) + " ";
            line += String.format("%-15s", labelF2) + " ";
            amountLine = BigDecimal.valueOf(qtyF2).multiply(priceF2);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyF3 > 0) {
            line += String.format("%1$2s", qtyF3) + " ";
            line += String.format("%-15s", labelF3) + " ";
            amountLine = BigDecimal.valueOf(qtyF3).multiply(priceF3);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyF4 > 0) {
            line += String.format("%1$2s", qtyF4) + " ";
            line += String.format("%-15s", labelF4) + " ";
            amountLine = BigDecimal.valueOf(qtyF4).multiply(priceF4);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyF5 > 0) {
            line += String.format("%1$2s", qtyF5) + " ";
            line += String.format("%-15s", labelF5) + " ";
            amountLine = BigDecimal.valueOf(qtyF5).multiply(priceF5);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyF6 > 0) {
            line += String.format("%1$2s", qtyF6) + " ";
            line += String.format("%-15s", labelF6) + " ";
            amountLine = BigDecimal.valueOf(qtyF6).multiply(priceF6);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyF7 > 0) {
            line += String.format("%1$2s", qtyF7) + " ";
            line += String.format("%-15s", labelF7) + " ";
            amountLine = BigDecimal.valueOf(qtyF7).multiply(priceF7);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyF8 > 0) {
            line += String.format("%1$2s", qtyF8) + " ";
            line += String.format("%-15s", labelF8) + " ";
            amountLine = BigDecimal.valueOf(qtyF8).multiply(priceF8);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyF9 > 0) {
            line += String.format("%1$2s", qtyF9) + " ";
            line += String.format("%-15s", labelF9) + " ";
            amountLine = BigDecimal.valueOf(qtyF9).multiply(priceF9);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyW1 > 0) {
            line += String.format("%1$2s", qtyW1) + " ";
            line += String.format("%-15s", labelW1) + " ";
            amountLine = BigDecimal.valueOf(qtyW1).multiply(priceW1);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyW2 > 0) {
            line += String.format("%1$2s", qtyW2) + " ";
            line += String.format("%-15s", labelW2) + " ";
            amountLine = BigDecimal.valueOf(qtyW2).multiply(priceW2);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyW3 > 0) {
            line += String.format("%1$2s", qtyW3) + " ";
            line += String.format("%-15s", labelW3) + " ";
            amountLine = BigDecimal.valueOf(qtyW3).multiply(priceW3);
            line += String.format("%5.2f", amountLine) + "\n";
        }
        if (qtyW4 > 0) {
            line += String.format("%1$2s", qtyW4) + " ";
            line += String.format("%-15s", labelW4) + " ";
            amountLine = BigDecimal.valueOf(qtyW4).multiply(priceW4);
            line += String.format("%5.2f", amountLine) + "\n";
        }

        // print the total amount
        line += "                --------\n";
        line += "   TOTAAL        ";
        line += String.format("%7.2f", amount) + "\n";

        return line;
    }


    String parseSaveData() {

        //Convert the total amount to a BigInteger, to avoid csv errors with decimal sign
        //--------------------------------------------------------------------------------
        BigDecimal amount100 = new BigDecimal(0);                 // helper variable
        amount100 = amount.scaleByPowerOfTen(2);                      // multiply with 100
        amount100.setScale(0,RoundingMode.HALF_UP);          // round to 0 decimals
        BigInteger amountInteger100 = amount100.toBigInteger();       // convert to integer

        sequenceNumber += 1;

        String data =
                String.valueOf(qtyA1) + "," +
                        String.valueOf(qtyA2) + "," +
                        String.valueOf(qtyA3) + "," +
                        String.valueOf(qtyA4) + "," +
                        String.valueOf(qtyA5) + "," +
                        String.valueOf(qtyA6) + "," +
                        String.valueOf(qtyA7) + "," +
                        String.valueOf(qtyA8) + "," +
                        String.valueOf(qtyB1) + "," +
                        String.valueOf(qtyB2) + "," +
                        String.valueOf(qtyB3) + "," +
                        String.valueOf(qtyB4) + "," +
                        String.valueOf(qtyB5) + "," +
                        String.valueOf(qtyB6) + "," +
                        String.valueOf(qtyB7) + "," +
                        String.valueOf(qtyB8) + "," +
                        String.valueOf(qtyV1) + "," +
                        String.valueOf(qtyI1) + "," +
                        String.valueOf(qtyI2) + "," +
                        String.valueOf(qtyI3) + "," +
                        String.valueOf(qtyI4) + "," +
                        String.valueOf(qtyI5) + "," +
                        String.valueOf(qtyI6) + "," +
                        String.valueOf(qtyI7) + "," +
                        String.valueOf(qtyF1) + "," +
                        String.valueOf(qtyF2) + "," +
                        String.valueOf(qtyF3) + "," +
                        String.valueOf(qtyF4) + "," +
                        String.valueOf(qtyF5) + "," +
                        String.valueOf(qtyF6) + "," +
                        String.valueOf(qtyF7) + "," +
                        String.valueOf(qtyF8) + "," +
                        String.valueOf(qtyF9) + "," +
                        String.valueOf(qtyK1) + "," +
                        String.valueOf(qtyK2) + "," +
                        String.valueOf(qtyK3) + "," +
                        String.valueOf(qtyK4) + "," +
                        String.valueOf(qtyK5) + "," +
                        String.valueOf(qtyK6) + "," +
                        String.valueOf(qtyT1) + "," +
                        String.valueOf(qtyT2) + "," +
                        String.valueOf(qtyT3) + "," +
                        String.valueOf(qtyW1) + "," +
                        String.valueOf(qtyW2) + "," +
                        String.valueOf(qtyW3) + "," +
                        String.valueOf(qtyW4) + "," +
                        amountInteger100.toString() +"," +
                        String.format("%8d", sequenceNumber);
        return data;
    }

    // INITIALIZE
    public void initializeQty() {
        runOnUiThread(new Runnable(){
            public void run() {
        qtyA1 = 0;
        qtyA2 = 0;
        qtyA3 = 0;
        qtyA4 = 0;
        qtyA5 = 0;
        qtyA6 = 0;
        qtyA7 = 0;
        qtyA8 = 0;
        qtyI1 = 0;
        qtyI2 = 0;
        qtyI3 = 0;
        qtyI4 = 0;
        qtyI5 = 0;
        qtyI6 = 0;
        qtyI7 = 0;
        qtyK1 = 0;
        qtyK2 = 0;
        qtyK3 = 0;
        qtyK4 = 0;
        qtyK5 = 0;
        qtyK6 = 0;
        qtyT1 = 0;
        qtyT2 = 0;
        qtyT3 = 0;
        qtyB1 = 0;
        qtyB2 = 0;
        qtyB3 = 0;
        qtyB4 = 0;
        qtyB5 = 0;
        qtyB6 = 0;
        qtyB7 = 0;
        qtyB8 = 0;
        qtyV1 = 0;
        qtyF1 = 0;
        qtyF2 = 0;
        qtyF3 = 0;
        qtyF4 = 0;
        qtyF5 = 0;
        qtyF6 = 0;
        qtyF7 = 0;
        qtyF8 = 0;
        qtyF9 = 0;
        qtyW1 = 0;
        qtyW2 = 0;
        qtyW3 = 0;
        qtyW4 = 0;


        priceA1 = BigDecimal.valueOf(2.20); // a Bieslook
        priceA2 = BigDecimal.valueOf(2.20); // a Parmesan
        priceA3 = BigDecimal.valueOf(2.50); // a Gorgonzola
        priceA4 = BigDecimal.valueOf(2.50); // a Olijf
        priceA5 = BigDecimal.valueOf(2.80); // a Ham
        priceA6 = BigDecimal.valueOf(2.80); // a Chorizzo
        priceA7 = BigDecimal.valueOf(3.00); // a Kippengehakt
        priceA8 = BigDecimal.valueOf(3.00); // a Zalm
        priceI1 = BigDecimal.valueOf(2.50); // i Magnum
        priceI2 = BigDecimal.valueOf(2.50); // i Cornet
        priceI3 = BigDecimal.valueOf(1.70); // i maxi vanille
        priceI4 = BigDecimal.valueOf(1.50); // i Satelite
        priceI5 = BigDecimal.valueOf(2.00); // i Potje Vanille
        priceI6 = BigDecimal.valueOf(2.00); // i Potje Chocolade
        priceI7 = BigDecimal.valueOf(2.00); // i Potje Aardbei
        priceK1 = BigDecimal.valueOf(2.00); // k Expresso
        priceK2 = BigDecimal.valueOf(2.20); // k Expresso Melk
        priceK3 = BigDecimal.valueOf(2.10); // k Lungo
        priceK4 = BigDecimal.valueOf(2.30); // k Lungo Melk
        priceK5 = BigDecimal.valueOf(2.10); // k Deca
        priceK6 = BigDecimal.valueOf(2.30); // k Deca Melk
        priceT1 = BigDecimal.valueOf(1.50); // t Yellow
        priceT2 = BigDecimal.valueOf(1.50); // t Green
        priceT3 = BigDecimal.valueOf(1.50); // t Rozenbottel
        priceB1 = BigDecimal.valueOf(3.20); // b Champignons
        priceB2 = BigDecimal.valueOf(3.20); // b Courgette
        priceB3 = BigDecimal.valueOf(4.00); // b Gehakt
        priceB4 = BigDecimal.valueOf(4.00); // b Ham
        priceB5 = BigDecimal.valueOf(3.20); // b Appel
        priceB6 = BigDecimal.valueOf(3.20); // b Chocolade
        priceB7 = BigDecimal.valueOf(3.50); // b Kokos
        priceB8 = BigDecimal.valueOf(3.50); // b Choc Orange
        priceV1 = BigDecimal.valueOf(2.00); // w Vanille
        priceF1 = BigDecimal.valueOf(1.90); // f Cola
        priceF2 = BigDecimal.valueOf(1.90); // f Cola Zero
        priceF3 = BigDecimal.valueOf(1.90); // f Ice Tea
        priceF4 = BigDecimal.valueOf(1.90); // f Fanta
        priceF5 = BigDecimal.valueOf(2.20); // f Appelsap
        priceF6 = BigDecimal.valueOf(2.50); // f Sinaasappelsap
        priceF7 = BigDecimal.valueOf(2.00); // f Cecemel
        priceF8 = BigDecimal.valueOf(1.80); // f Plat water
        priceF9 = BigDecimal.valueOf(1.80); // f Spuitwater
        priceW1 = BigDecimal.valueOf(2.50); // w Pils
        priceW2 = BigDecimal.valueOf(2.70); // w Wijn W / R / Rz
        priceW3 = BigDecimal.valueOf(3.00); // w Mocktail
        priceW4 = BigDecimal.valueOf(5.50); // w Mojito

        amount = BigDecimal.valueOf(0);
            }
        });
    // HERE ENDS THE LONG PROCESS
                 try {

                    // code runs in a thread
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mProgressDialog.dismiss();
                        }
                    });
                } catch (final Exception ex) {
                    Log.i("---","Exception in thread");
                }
            }
        }.start();

     }

    // Load data
    public void loadData() {
        runOnUiThread(new Runnable(){
            public void run() {

                textA1.setText(Integer.toString(qtyA1));
                textA2.setText(Integer.toString(qtyA2));
                textA3.setText(Integer.toString(qtyA3));
                textA4.setText(Integer.toString(qtyA4));
                textA5.setText(Integer.toString(qtyA5));
                textA6.setText(Integer.toString(qtyA6));
                textA7.setText(Integer.toString(qtyA7));
                textA8.setText(Integer.toString(qtyA8));
                textI1.setText(Integer.toString(qtyI1));
                textI2.setText(Integer.toString(qtyI2));
                textI3.setText(Integer.toString(qtyI3));
                textI4.setText(Integer.toString(qtyI4));
                textI5.setText(Integer.toString(qtyI5));
                textI6.setText(Integer.toString(qtyI6));
                textI7.setText(Integer.toString(qtyI7));
                textK1.setText(Integer.toString(qtyK1));
                textK2.setText(Integer.toString(qtyK2));
                textK3.setText(Integer.toString(qtyK3));
                textK4.setText(Integer.toString(qtyK4));
                textK5.setText(Integer.toString(qtyK5));
                textK6.setText(Integer.toString(qtyK6));
                textT1.setText(Integer.toString(qtyT1));
                textT2.setText(Integer.toString(qtyT2));
                textT3.setText(Integer.toString(qtyT3));
                textB1.setText(Integer.toString(qtyB1));
                textB2.setText(Integer.toString(qtyB2));
                textB3.setText(Integer.toString(qtyB3));
                textB4.setText(Integer.toString(qtyB4));
                textB5.setText(Integer.toString(qtyB5));
                textB6.setText(Integer.toString(qtyB6));
                textB7.setText(Integer.toString(qtyB7));
                textB8.setText(Integer.toString(qtyB8));
                textV1.setText(Integer.toString(qtyV1));
                textF1.setText(Integer.toString(qtyF1));
                textF2.setText(Integer.toString(qtyF2));
                textF3.setText(Integer.toString(qtyF3));
                textF4.setText(Integer.toString(qtyF4));
                textF5.setText(Integer.toString(qtyF5));
                textF6.setText(Integer.toString(qtyF6));
                textF7.setText(Integer.toString(qtyF7));
                textF8.setText(Integer.toString(qtyF8));
                textF9.setText(Integer.toString(qtyF9));
                textW1.setText(Integer.toString(qtyW1));
                textW2.setText(Integer.toString(qtyW2));
                textW3.setText(Integer.toString(qtyW3));
                textW4.setText(Integer.toString(qtyW4));
                if (qtyA1 > 0) {
                    textA1.setBackgroundColor(textA1.getContext().getResources().getColor(R.color.grey));
                    textA1.setTextColor(textA1.getContext().getResources().getColor(R.color.white));
                } else {
                    textA1.setBackgroundColor(textA1.getContext().getResources().getColor(R.color.white));
                    textA1.setTextColor(textA1.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyA2 > 0) {
                    textA2.setBackgroundColor(textA2.getContext().getResources().getColor(R.color.grey));
                    textA2.setTextColor(textA2.getContext().getResources().getColor(R.color.white));
                } else {
                    textA2.setBackgroundColor(textA2.getContext().getResources().getColor(R.color.white));
                    textA2.setTextColor(textA2.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyA3 > 0) {
                    textA3.setBackgroundColor(textA3.getContext().getResources().getColor(R.color.grey));
                    textA3.setTextColor(textA3.getContext().getResources().getColor(R.color.white));
                } else {
                    textA3.setBackgroundColor(textA3.getContext().getResources().getColor(R.color.white));
                    textA3.setTextColor(textA3.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyA4 > 0) {
                    textA4.setBackgroundColor(textA4.getContext().getResources().getColor(R.color.grey));
                    textA4.setTextColor(textA4.getContext().getResources().getColor(R.color.white));
                } else {
                    textA4.setBackgroundColor(textA4.getContext().getResources().getColor(R.color.white));
                    textA4.setTextColor(textA4.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyA5 > 0) {
                    textA5.setBackgroundColor(textA5.getContext().getResources().getColor(R.color.grey));
                    textA5.setTextColor(textA5.getContext().getResources().getColor(R.color.white));
                } else {
                    textA5.setBackgroundColor(textA5.getContext().getResources().getColor(R.color.white));
                    textA5.setTextColor(textA5.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyA6 > 0) {
                    textA6.setBackgroundColor(textA6.getContext().getResources().getColor(R.color.grey));
                    textA6.setTextColor(textA6.getContext().getResources().getColor(R.color.white));
                } else {
                    textA6.setBackgroundColor(textA6.getContext().getResources().getColor(R.color.white));
                    textA6.setTextColor(textA6.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyA7 > 0) {
                    textA7.setBackgroundColor(textA7.getContext().getResources().getColor(R.color.grey));
                    textA7.setTextColor(textA7.getContext().getResources().getColor(R.color.white));
                } else {
                    textA7.setBackgroundColor(textA7.getContext().getResources().getColor(R.color.white));
                    textA7.setTextColor(textA7.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyA8 > 0) {
                    textA8.setBackgroundColor(textA8.getContext().getResources().getColor(R.color.grey));
                    textA8.setTextColor(textA8.getContext().getResources().getColor(R.color.white));
                } else {
                    textA8.setBackgroundColor(textA8.getContext().getResources().getColor(R.color.white));
                    textA8.setTextColor(textA8.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyI1 > 0) {
                    textI1.setBackgroundColor(textI1.getContext().getResources().getColor(R.color.grey));
                    textI1.setTextColor(textI1.getContext().getResources().getColor(R.color.white));
                } else {
                    textI1.setBackgroundColor(textI1.getContext().getResources().getColor(R.color.white));
                    textI1.setTextColor(textI1.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyI2 > 0) {
                    textI2.setBackgroundColor(textI2.getContext().getResources().getColor(R.color.grey));
                    textI2.setTextColor(textI2.getContext().getResources().getColor(R.color.white));
                } else {
                    textI2.setBackgroundColor(textI2.getContext().getResources().getColor(R.color.white));
                    textI2.setTextColor(textI2.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyI3 > 0) {
                    textI3.setBackgroundColor(textI3.getContext().getResources().getColor(R.color.grey));
                    textI3.setTextColor(textI3.getContext().getResources().getColor(R.color.white));
                } else {
                    textI3.setBackgroundColor(textI3.getContext().getResources().getColor(R.color.white));
                    textI3.setTextColor(textI3.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyI4 > 0) {
                    textI4.setBackgroundColor(textI4.getContext().getResources().getColor(R.color.grey));
                    textI4.setTextColor(textI4.getContext().getResources().getColor(R.color.white));
                } else {
                    textI4.setBackgroundColor(textI4.getContext().getResources().getColor(R.color.white));
                    textI4.setTextColor(textI4.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyI5 > 0) {
                    textI5.setBackgroundColor(textI5.getContext().getResources().getColor(R.color.grey));
                    textI5.setTextColor(textI5.getContext().getResources().getColor(R.color.white));
                } else {
                    textI5.setBackgroundColor(textI5.getContext().getResources().getColor(R.color.white));
                    textI5.setTextColor(textI5.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyI6 > 0) {
                    textI6.setBackgroundColor(textI6.getContext().getResources().getColor(R.color.grey));
                    textI6.setTextColor(textI6.getContext().getResources().getColor(R.color.white));
                } else {
                    textI6.setBackgroundColor(textI6.getContext().getResources().getColor(R.color.white));
                    textI6.setTextColor(textI6.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyI7 > 0) {
                    textI7.setBackgroundColor(textI7.getContext().getResources().getColor(R.color.grey));
                    textI7.setTextColor(textI7.getContext().getResources().getColor(R.color.white));
                } else {
                    textI7.setBackgroundColor(textI7.getContext().getResources().getColor(R.color.white));
                    textI7.setTextColor(textI7.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyK1 > 0) {
                    textK1.setBackgroundColor(textK1.getContext().getResources().getColor(R.color.grey));
                    textK1.setTextColor(textK1.getContext().getResources().getColor(R.color.white));
                } else {
                    textK1.setBackgroundColor(textK1.getContext().getResources().getColor(R.color.white));
                    textK1.setTextColor(textK1.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyK2 > 0) {
                    textK2.setBackgroundColor(textK2.getContext().getResources().getColor(R.color.grey));
                    textK2.setTextColor(textK2.getContext().getResources().getColor(R.color.white));
                } else {
                    textK2.setBackgroundColor(textK2.getContext().getResources().getColor(R.color.white));
                    textK2.setTextColor(textK2.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyK3 > 0) {
                    textK3.setBackgroundColor(textK3.getContext().getResources().getColor(R.color.grey));
                    textK3.setTextColor(textK3.getContext().getResources().getColor(R.color.white));
                } else {
                    textK3.setBackgroundColor(textK3.getContext().getResources().getColor(R.color.white));
                    textK3.setTextColor(textK3.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyK4 > 0) {
                    textK4.setBackgroundColor(textK4.getContext().getResources().getColor(R.color.grey));
                    textK4.setTextColor(textK4.getContext().getResources().getColor(R.color.white));
                } else {
                    textK4.setBackgroundColor(textK4.getContext().getResources().getColor(R.color.white));
                    textK4.setTextColor(textK4.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyK5 > 0) {
                    textK5.setBackgroundColor(textK5.getContext().getResources().getColor(R.color.grey));
                    textK5.setTextColor(textK5.getContext().getResources().getColor(R.color.white));
                } else {
                    textK5.setBackgroundColor(textK5.getContext().getResources().getColor(R.color.white));
                    textK5.setTextColor(textK5.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyK6 > 0) {
                    textK6.setBackgroundColor(textK6.getContext().getResources().getColor(R.color.grey));
                    textK6.setTextColor(textK6.getContext().getResources().getColor(R.color.white));
                } else {
                    textK6.setBackgroundColor(textK6.getContext().getResources().getColor(R.color.white));
                    textK6.setTextColor(textK6.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyT1 > 0) {
                    textT1.setBackgroundColor(textT1.getContext().getResources().getColor(R.color.grey));
                    textT1.setTextColor(textT1.getContext().getResources().getColor(R.color.white));
                } else {
                    textT1.setBackgroundColor(textT1.getContext().getResources().getColor(R.color.white));
                    textT1.setTextColor(textT1.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyT2 > 0) {
                    textT2.setBackgroundColor(textT2.getContext().getResources().getColor(R.color.grey));
                    textT2.setTextColor(textT2.getContext().getResources().getColor(R.color.white));
                } else {
                    textT2.setBackgroundColor(textT2.getContext().getResources().getColor(R.color.white));
                    textT2.setTextColor(textT2.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyT3 > 0) {
                    textT3.setBackgroundColor(textT3.getContext().getResources().getColor(R.color.grey));
                    textT3.setTextColor(textT3.getContext().getResources().getColor(R.color.white));
                } else {
                    textT3.setBackgroundColor(textT3.getContext().getResources().getColor(R.color.white));
                    textT3.setTextColor(textT3.getContext().getResources().getColor(R.color.grey));
                }
                /*
                if (qtyW4 > 0) {
                    textW4.setBackgroundColor(textW4.getContext().getResources().getColor(R.color.grey));
                    textW4.setTextColor(textW4.getContext().getResources().getColor(R.color.white));
                } else {
                    textW4.setBackgroundColor(textW4.getContext().getResources().getColor(R.color.white));
                    textW4.setTextColor(textW4.getContext().getResources().getColor(R.color.grey));
                }
                */
                if (qtyB1 > 0) {
                    textB1.setBackgroundColor(textB1.getContext().getResources().getColor(R.color.grey));
                    textB1.setTextColor(textB1.getContext().getResources().getColor(R.color.white));
                } else {
                    textB1.setBackgroundColor(textB1.getContext().getResources().getColor(R.color.white));
                    textB1.setTextColor(textB1.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyB2 > 0) {
                    textB2.setBackgroundColor(textB2.getContext().getResources().getColor(R.color.grey));
                    textB2.setTextColor(textB2.getContext().getResources().getColor(R.color.white));
                } else {
                    textB2.setBackgroundColor(textB2.getContext().getResources().getColor(R.color.white));
                    textB2.setTextColor(textB2.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyB3 > 0) {
                    textB3.setBackgroundColor(textB3.getContext().getResources().getColor(R.color.grey));
                    textB3.setTextColor(textB3.getContext().getResources().getColor(R.color.white));
                } else {
                    textB3.setBackgroundColor(textB3.getContext().getResources().getColor(R.color.white));
                    textB3.setTextColor(textB3.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyB4 > 0) {
                    textB4.setBackgroundColor(textB4.getContext().getResources().getColor(R.color.grey));
                    textB4.setTextColor(textB4.getContext().getResources().getColor(R.color.white));
                } else {
                    textB4.setBackgroundColor(textB4.getContext().getResources().getColor(R.color.white));
                    textB4.setTextColor(textB4.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyB5 > 0) {
                    textB5.setBackgroundColor(textB5.getContext().getResources().getColor(R.color.grey));
                    textB5.setTextColor(textB5.getContext().getResources().getColor(R.color.white));
                } else {
                    textB5.setBackgroundColor(textB5.getContext().getResources().getColor(R.color.white));
                    textB5.setTextColor(textB5.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyB6 > 0) {
                    textB6.setBackgroundColor(textB6.getContext().getResources().getColor(R.color.grey));
                    textB6.setTextColor(textB6.getContext().getResources().getColor(R.color.white));
                } else {
                    textB6.setBackgroundColor(textB6.getContext().getResources().getColor(R.color.white));
                    textB6.setTextColor(textB6.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyB7 > 0) {
                    textB7.setBackgroundColor(textB7.getContext().getResources().getColor(R.color.grey));
                    textB7.setTextColor(textB7.getContext().getResources().getColor(R.color.white));
                } else {
                    textB7.setBackgroundColor(textB7.getContext().getResources().getColor(R.color.white));
                    textB7.setTextColor(textB7.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyB8 > 0) {
                    textB8.setBackgroundColor(textB8.getContext().getResources().getColor(R.color.grey));
                    textB8.setTextColor(textB8.getContext().getResources().getColor(R.color.white));
                } else {
                    textB8.setBackgroundColor(textB8.getContext().getResources().getColor(R.color.white));
                    textB8.setTextColor(textB8.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyV1 > 0) {
                    textV1.setBackgroundColor(textV1.getContext().getResources().getColor(R.color.grey));
                    textV1.setTextColor(textV1.getContext().getResources().getColor(R.color.white));
                } else {
                    textV1.setBackgroundColor(textV1.getContext().getResources().getColor(R.color.white));
                    textV1.setTextColor(textV1.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyF1 > 0) {
                    textF1.setBackgroundColor(textF1.getContext().getResources().getColor(R.color.grey));
                    textF1.setTextColor(textF1.getContext().getResources().getColor(R.color.white));
                } else {
                    textF1.setBackgroundColor(textF1.getContext().getResources().getColor(R.color.white));
                    textF1.setTextColor(textF1.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyF2 > 0) {
                    textF2.setBackgroundColor(textF2.getContext().getResources().getColor(R.color.grey));
                    textF2.setTextColor(textF2.getContext().getResources().getColor(R.color.white));
                } else {
                    textF2.setBackgroundColor(textF2.getContext().getResources().getColor(R.color.white));
                    textF2.setTextColor(textF2.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyF3 > 0) {
                    textF3.setBackgroundColor(textF3.getContext().getResources().getColor(R.color.grey));
                    textF3.setTextColor(textF3.getContext().getResources().getColor(R.color.white));
                } else {
                    textF3.setBackgroundColor(textF3.getContext().getResources().getColor(R.color.white));
                    textF3.setTextColor(textF3.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyF4 > 0) {
                    textF4.setBackgroundColor(textF4.getContext().getResources().getColor(R.color.grey));
                    textF4.setTextColor(textF4.getContext().getResources().getColor(R.color.white));
                } else {
                    textF4.setBackgroundColor(textF4.getContext().getResources().getColor(R.color.white));
                    textF4.setTextColor(textF4.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyF5 > 0) {
                    textF5.setBackgroundColor(textF5.getContext().getResources().getColor(R.color.grey));
                    textF5.setTextColor(textF5.getContext().getResources().getColor(R.color.white));
                } else {
                    textF5.setBackgroundColor(textF5.getContext().getResources().getColor(R.color.white));
                    textF5.setTextColor(textF5.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyF6 > 0) {
                    textF6.setBackgroundColor(textF6.getContext().getResources().getColor(R.color.grey));
                    textF6.setTextColor(textF6.getContext().getResources().getColor(R.color.white));
                } else {
                    textF6.setBackgroundColor(textF6.getContext().getResources().getColor(R.color.white));
                    textF6.setTextColor(textF6.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyF7 > 0) {
                    textF7.setBackgroundColor(textF7.getContext().getResources().getColor(R.color.grey));
                    textF7.setTextColor(textF7.getContext().getResources().getColor(R.color.white));
                } else {
                    textF7.setBackgroundColor(textF7.getContext().getResources().getColor(R.color.white));
                    textF7.setTextColor(textF7.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyF8 > 0) {
                    textF8.setBackgroundColor(textF8.getContext().getResources().getColor(R.color.grey));
                    textF8.setTextColor(textF8.getContext().getResources().getColor(R.color.white));
                } else {
                    textF8.setBackgroundColor(textF8.getContext().getResources().getColor(R.color.white));
                    textF8.setTextColor(textF8.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyF9 > 0) {
                    textF9.setBackgroundColor(textF9.getContext().getResources().getColor(R.color.grey));
                    textF9.setTextColor(textF9.getContext().getResources().getColor(R.color.white));
                } else {
                    textF9.setBackgroundColor(textF9.getContext().getResources().getColor(R.color.white));
                    textF9.setTextColor(textF9.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyW1 > 0) {
                    textW1.setBackgroundColor(textW1.getContext().getResources().getColor(R.color.grey));
                    textW1.setTextColor(textW1.getContext().getResources().getColor(R.color.white));
                } else {
                    textW1.setBackgroundColor(textW1.getContext().getResources().getColor(R.color.white));
                    textW1.setTextColor(textW1.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyW2 > 0) {
                    textW2.setBackgroundColor(textW2.getContext().getResources().getColor(R.color.grey));
                    textW2.setTextColor(textW2.getContext().getResources().getColor(R.color.white));
                } else {
                    textW2.setBackgroundColor(textW2.getContext().getResources().getColor(R.color.white));
                    textW2.setTextColor(textW2.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyW3 > 0) {
                    textW3.setBackgroundColor(textW3.getContext().getResources().getColor(R.color.grey));
                    textW3.setTextColor(textW3.getContext().getResources().getColor(R.color.white));
                } else {
                    textW3.setBackgroundColor(textW3.getContext().getResources().getColor(R.color.white));
                    textW3.setTextColor(textW3.getContext().getResources().getColor(R.color.grey));
                }
                if (qtyW4 > 0) {
                    textW4.setBackgroundColor(textW4.getContext().getResources().getColor(R.color.grey));
                    textW4.setTextColor(textW4.getContext().getResources().getColor(R.color.white));
                } else {
                    textW4.setBackgroundColor(textW4.getContext().getResources().getColor(R.color.white));
                    textW4.setTextColor(textW4.getContext().getResources().getColor(R.color.grey));
                }

                BigDecimal bdcurrentTotalAmount = amount.setScale(2, RoundingMode.HALF_EVEN);
                textAmount.setText(bdcurrentTotalAmount.toString());

            }
        });

    }



}


