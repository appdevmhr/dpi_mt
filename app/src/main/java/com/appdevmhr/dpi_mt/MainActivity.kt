package com.appdevmhr.dpi_mt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appdevmhr.dpi_mt.ui.theme.Dpi_mtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dpi_mtTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   Screen(
                       title = "Department of Mechanical ", data = "Correspondence :\n" +
                               "\n" +
                               "Head of the Department,\n" +
                               "Department of Mechanical Technology,\n" +
                               "Dhaka Polytechnic Institute (DPI),\n" +
                               "Tejgaon.I/A, Dhaka -1208 . Bangladesh.\n" +
                               "Tel: (8802) 9116724, Fax: (8802) 9116724.\n" +
                               "Email: mechanical.dpi@gmail.com\n" +
                               "\n" +
                               "So, welcome to the Department of Mechanical Technology at DPI. We are proud to say that, in educational and industrial services, our excellence is our strength.\n" +
                               "\n" +
                               "Technology Introduction:\n" +
                               "The Department of Mechanical Technology is diverse in educational background, professional experience, and interests. The Department is committed to teaching and public service. A number of Department members hold graduate and undergraduate degrees in a variety of related fields. The Department is enriched each year by new regular Department appointees as well as return of Department after completing higher education and training abroad. This infusion of new teaching and scholarly talents adds freshness and vitality to the Department of Mechanical Technology.\n" +
                               "\n" +
                               " \n" +
                               "\n" +
                               "Message from Head of the Department:\n" +
                               "\n" +
                               "        Welcome to the Department of Mechanical Technology, Dhaka Polytechnic Institute (DPI), The department has been the apex of mechanical engineering education and research in the country since it started to offer four year’s Diploma ’ degree in 1955.  At present, there are about twenty  highly qualified and dedicated teachers to prepare our students to meet the global engineering challenges of the twenty first century. The department is persistent in its effort to develop its students not only as competent engineers but also as creative and responsible members of the society.\n" +
                               "\n" +
                               "The department maintains 7 modern shop / laboratories for Diploma graduate instructions works.  The level of education is up-to-date, comparable to those of the best institutions of the country and justifiably appropriate to the needs of the Bangladesh.  The Department of Mechanical Technology is forming the technical backbone of the country to facilitate and sustain its rapidly developing industrial growth."
                   )
                }
            }
        }
    }
}
@Composable
fun Screen(
    title: String,
    data: String
) {
    val scr = rememberScrollState()
    Surface(
        modifier = Modifier
            .verticalScroll(scr)
            .fillMaxSize()
            .padding(16.dp),
        color = MaterialTheme.colorScheme.background
    ) {

        Column {
            Text(
                style = TextStyle(
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.W900
                ),
                text = title,
            )
            Spacer(modifier = Modifier.height(30.dp))
//            Image(
//                painter = painterResource(id = R.drawable.cst),
//                contentDescription = "",
//                alignment = Alignment.Center,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp)
//            )
            Spacer(modifier = Modifier.height(30.dp))
            GreetingDPICST(data = data)
        }

    }
}

@Composable
fun GreetingDPICST(data: String, modifier: Modifier = Modifier) {
    Text(
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold
        ),
        textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
        text = data,
        modifier = modifier
    )
}
