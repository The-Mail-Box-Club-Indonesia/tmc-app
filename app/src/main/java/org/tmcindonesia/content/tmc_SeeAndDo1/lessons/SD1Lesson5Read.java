package org.tmcindonesia.content.tmc_SeeAndDo1.lessons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.tmcindonesia.R;
import org.tmcindonesia.application.HomeApp;
import org.tmcindonesia.content.tmc_SeeAndDo1.questions.LESSON5;

public class SD1Lesson5Read extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_layout);

        // PDF View
        // pdf-view instance object
        PDFView pdfView = findViewById(R.id.pdfView);
        // pdf-view method
        pdfView.fromAsset("seeanddo_published.pdf")
                .pages(34,35,36,37,38)
                .enableSwipe(true)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true)
                .autoSpacing(false)
                .fitEachPage(true)
                .spacing(0)
                .pageSnap(false)
                .pageFling(false)
                .nightMode(false)
                .load();

        FloatingActionButton fab_goToQuestion;
        fab_goToQuestion = findViewById(R.id.fab_question);
        fab_goToQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LESSON5.class));
            }
        });
    }
}
