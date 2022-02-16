package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class AboutbmiActivity extends AppCompatActivity {
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutbmi2);

        text = findViewById(R.id.text1);
        String para = "About Adult BMI\n" +
                "\n" +
                "Body mass index (BMI) is a person’s weight in kilograms divided by the square of height in meters. BMI is an inexpensive and easy screening method for weight category—underweight, healthy weight, overweight, and obesity.\n" +
                "\n" +
                "BMI does not measure body fat directly, but BMI is moderately correlated with more direct measures of body fat 1,2,3. Furthermore, BMI appears to be as strongly correlated with various metabolic and disease outcome as are these more direct measures of body fatness.\n" +
                "\n" +
                "How is BMI used?\n" +
                "\n" +
                "BMI can be a screening tool, but it does not diagnose the body fatness or health of an individual. To determine if BMI is a health risk, a healthcare provider performs further assessments. Such assessments include skinfold thickness measurements, evaluations of diet, physical activity, and family history.\n" +
                "\n" +
                "What are the BMI trends for adults in the United States?\n" +
                "The prevalence of adult BMI greater than or equal to 30 kg/m2 (obese status) has greatly increased since the 1970s. Recently, however, this trend has leveled off, except for older women. Obesity has continued to increase in adult women who are age 60 years and older.\n" +
                "\n" +
                "To learn more about the trends of adult obesity, visit Adult Obesity Facts.\n" +
                "Top of Page\n" +
                "Why is BMI used to measure overweight and obesity?\n" +
                "Because calculation requires only height and weight, BMI is an inexpensive and easy tool. To see the formula based on either kilograms and meters or pounds and inches, visit How is BMI calculated?\n" +
                "Top of Page\n" +
                "What are other ways to assess excess body fatness besides BMI?\n" +
                "Other methods to measure body fatness include skinfold thickness measurements (with calipers), underwater weighing, bioelectrical impedance, dual-energy x-ray absorptiometry (DXA), and isotope dilution 1,2,3. However, these methods are not always readily available, and they are either expensive or need to be conducted by highly trained personnel. Furthermore, many of these methods can be difficult to standardize across observers or machines, complicating comparisons across studies and time periods.\n" +
                "\n" +
                "Physical Activity\n" +
                "\n" +
                "In The Spotlight\n" +
                "Health Equity\n" +
                "Physical activity is embedded in initiatives, programs, and priorities to remove environmental and systemic barriers to health.\n" +
                "What’s Your Role?\n" +
                "Active People, Healthy Nation℠ has a new information hub with case studies and other sector-specific information to promote physical activity. Learn how people in different sectors can promote physical activity for individuals and help create active communities for everyone.\n" +
                "Progress and New Directions in Physical Activity Surveillanceexternal icon\n" +
                "This supplement of the Journal of Physical Activity & Health examines up to 20-year trends in aerobic, muscle-strengthening, and sitting behavior among adults and youth in the US. The supplement also discusses the history of these surveillance data, and explores future directions, opportunities, and challenges for national physical activity surveillance.\n" +
                "Complete Streets Maps pdf icon[PDF-12.6MB]external icon\n" +
                "These updated maps by the National Complete Streets Coalition show the adoption of state, local, and regional Complete Streets Policies from 2000 to 2020 across the United States.\n";
        text.setText(para);
        text.setMovementMethod(new ScrollingMovementMethod());
    }
}