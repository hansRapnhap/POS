package be.rapnhap.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.math.BigDecimal;


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

    public TextView textAmount;

    protected ProgressDialog mProgressDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_of_sale);

        // RUN LONG PROCESS IN SEPARATE FUNCTION
        runLongProcess();
    }


        // HERE STARTS THE LOG PROCESS
        private void runLongProcess() {
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
                    String.valueOf(qtyV1) + "," +
                    String.valueOf(qtyI1) + "," +
                    String.valueOf(qtyI2) + "," +
                    String.valueOf(qtyI3) + "," +
                    String.valueOf(qtyI4) + "," +
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
                    String.valueOf(qtyW3) + ","
                    ;

                PrintRequest printRequest = new PrintRequest(data);
                printRequest.printData();

                //PrintSocket printSocket = new PrintSocket();
                //printSocket.sendToSocket();


                initializeQty();
                loadData();

            }
        });

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


        priceA1 = BigDecimal.valueOf(2.00); // a Bieslook
        priceA2 = BigDecimal.valueOf(2.00); // a Parmesan
        priceA3 = BigDecimal.valueOf(2.30); // a Gorgonzola
        priceA4 = BigDecimal.valueOf(2.30); // a Olijf
        priceA5 = BigDecimal.valueOf(2.50); // a Ham
        priceA6 = BigDecimal.valueOf(2.50); // a Chorizzo
        priceA7 = BigDecimal.valueOf(2.80); // a Kippengehakt
        priceA8 = BigDecimal.valueOf(3.00); // a Zalm
        priceI1 = BigDecimal.valueOf(2.30); // i Big Chocolate
        priceI2 = BigDecimal.valueOf(2.00); // i Cornet
        priceI3 = BigDecimal.valueOf(1.20); // i maxi vanille
        priceI4 = BigDecimal.valueOf(1.00); // i Satelite
        priceK1 = BigDecimal.valueOf(1.80); // k Expresso
        priceK2 = BigDecimal.valueOf(2.00); // k Expresso Melk
        priceK3 = BigDecimal.valueOf(2.00); // k Lungo
        priceK4 = BigDecimal.valueOf(2.20); // k Lungo Melk
        priceK5 = BigDecimal.valueOf(2.00); // k Deca
        priceK6 = BigDecimal.valueOf(2.20); // k Deca Melk
        priceT1 = BigDecimal.valueOf(1.50); // t Yellow
        priceT2 = BigDecimal.valueOf(1.50); // t Green
        priceT3 = BigDecimal.valueOf(1.50); // T Rozenbottel
        priceB1 = BigDecimal.valueOf(3.00); // b Champignons
        priceB2 = BigDecimal.valueOf(3.00); // b Courgette
        priceB3 = BigDecimal.valueOf(3.80); // b Gehakt
        priceB4 = BigDecimal.valueOf(3.80); // b Ham
        priceB5 = BigDecimal.valueOf(3.00); // b Appel
        priceB6 = BigDecimal.valueOf(3.00); // b Chocolade
        priceV1 = BigDecimal.valueOf(2.00); // w Vanille
        priceF1 = BigDecimal.valueOf(1.50); // f Cola
        priceF2 = BigDecimal.valueOf(1.50); // f Cola Zero
        priceF3 = BigDecimal.valueOf(1.50); // f Ice Tea
        priceF4 = BigDecimal.valueOf(1.50); // f Fanta
        priceF5 = BigDecimal.valueOf(2.00); // f Appelsap
        priceF6 = BigDecimal.valueOf(2.50); // f Sinaasappelsap
        priceF7 = BigDecimal.valueOf(2.00); // f Cecemel
        priceF8 = BigDecimal.valueOf(1.50); // f Plat water
        priceF9 = BigDecimal.valueOf(1.50); // f Spuitwater
        priceW1 = BigDecimal.valueOf(2.00); // w Pils
        priceW2 = BigDecimal.valueOf(2.50); // w Witte wijn
        priceW3 = BigDecimal.valueOf(2.50); // w Rode wijn

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

        textAmount.setText(String.valueOf(amount.doubleValue()));
            }
        });

    }

}


