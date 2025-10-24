import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun Praktikum4(modifier: Modifier){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.pfp),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(top = 50.dp)
                .size(170.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            SocialIcon(R.drawable.facebook)
            SocialIcon(R.drawable.google)
            SocialIcon(R.drawable.twitter)
            SocialIcon(R.drawable.linkedin)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = stringResource(R.string.name),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = stringResource(R.string.username),
            fontSize = 16.sp,
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Saya seorang Back End Developer",
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(20.dp))

        MenuItem(title = "Privacy", iconRes = R.drawable.privacy)
        Spacer(modifier = Modifier.height(5.dp))
        MenuItem(title = "Riwayat Transaksi", iconRes = R.drawable.history)
        Spacer(modifier = Modifier.height(5.dp))
        MenuItem(title = "Pengaturan", iconRes = R.drawable.setting)

        Spacer(modifier = Modifier.height(45.dp))

        Text(
            text = stringResource(R.string.copyr),
            fontSize = 12.sp,
            color = Color.DarkGray
        )
    }
}

@Composable
fun SocialIcon(iconRes: Int) {
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .clickable { }
            .padding(8.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = "Social Icon",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .clip(CircleShape)
                .fillMaxSize()
        )
    }
}

@Composable
fun MenuItem(title: String, iconRes: Int) {
}