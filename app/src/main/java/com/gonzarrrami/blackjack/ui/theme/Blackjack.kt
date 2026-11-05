package com.gonzarrrami.blackjack.ui.theme

// ♠\uFE0 ♥\uFE0E ♦\uFE0E ♣\uFE0E
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun BoxTapete(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
        contentAlignment = Alignment.Center
    ){
        Column(modifier = Modifier.width(500.dp) .height(500.dp)
                .background(DarkGreen)
            ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = DarkGreen),
                horizontalArrangement = (Arrangement.Center),
                verticalAlignment = Alignment.Top

                ){
                  Box(modifier = Modifier
                      .size(width = 180.dp, height = 90.dp)
                      .border(
                          width = 2.dp,
                          color = Color.Black,
                          shape = RoundedCornerShape(bottomStart = 90.dp, bottomEnd = 90.dp)
                      ),
                      contentAlignment = Alignment.TopCenter
                  ){
                   Row(modifier = Modifier.padding(top = 6.dp)) {
                    Column(modifier = Modifier. width(40.dp)
                        .height(62.5.dp)
                        .background(Color.White, shape = RoundedCornerShape(size = 5.dp))
                        .border(width = 2.dp, Color.Black, shape = RoundedCornerShape(size = 5.dp)),
                    )
                    {
                        Text(modifier = Modifier.weight(1f)
                            .align(Alignment.Start),
                            text = " A",
                            color = Color.Red
                        )
                        Text(modifier = Modifier.weight(2f)
                            .align(Alignment.CenterHorizontally)
                            .wrapContentHeight(Alignment.CenterVertically)
                            .offset(y = (-3).dp),
                            text = "♥\uFE0E",
                            color = Color.Red,
                            fontSize = 26.sp

                        )
                        Text(modifier = Modifier.weight(1f)
                            .align(Alignment.End)
                            .rotate(180f) ,
                            text = " A",
                            color = Color.Red
                        )
                    }
                    Column(modifier = Modifier. width(40.dp)
                        .height(62.5.dp)
                        .background(Color.Black, shape = RoundedCornerShape(size = 5.dp))
                        .border(width = 2.dp, Color.White, shape = RoundedCornerShape(size = 5.dp))
                        )
                    {

                    }
                   }
                  }

            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color=DarkGreen),
                horizontalArrangement = Arrangement.SpaceBetween
              ){
              Column(modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
              ){
                Row(modifier = Modifier

                    .border(width= 2.dp, color = Color.Black, shape = RoundedCornerShape(size = 5.dp))
                    .height(40.dp)
                    .width(62.5.dp)
                    .background(Color.White, shape = RoundedCornerShape(size = 5.dp))

                ){
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = -90f)
                            .offset (x = 4.dp, y = 4.dp),
                            text="3  "
                        )
                    }
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = -90f)
                            .offset (x = 10.dp),
                            text="♣\uFE0E"
                        )
                    }
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = -90f)
                            .offset (x = 10.dp),
                            text="♣\uFE0E"
                        )
                    }
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = -90f)
                            .offset (x = 10.dp),
                            text="♣\uFE0E"
                        )
                    }
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.TopStart
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = 90f)
                            .offset (y = 4.dp),
                            text="3"
                        )
                    }
                }
                Row(modifier = Modifier

                    .border(width= 2.dp, color = Color.Black, shape = RoundedCornerShape(size = 5.dp))
                    .height(40.dp)
                    .width(62.5.dp)
                    .background(Color.White, shape = RoundedCornerShape(size = 5.dp))

                ){
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.BottomStart
                    )
                    {
                        Text(modifier = Modifier
                            .rotate(degrees = -90f)
                            .offset (x = 4.dp, y = 4.dp),
                            text="4  ",
                        )
                    }
                    Box(modifier = Modifier.weight(2f)
                        .fillMaxHeight(),

                    )
                    {
                        Text(modifier = Modifier
                            .rotate(degrees = -90f)
                            .offset (x = -8.dp, y = -2.dp),
                            text="♠\uFE0E" +
                                    "♠\uFE0E",
                        )
                    }
                    Box(modifier= Modifier.weight(2f)
                        .fillMaxHeight(),
                        )
                    {
                        Text(modifier = Modifier
                            .rotate(degrees = -90f)
                            .offset (x = -8.dp, y = -3.dp),
                            text="♠\uFE0E" +
                                    "♠\uFE0E",
                        )
                    }
                    Box(modifier= Modifier.weight(1f)
                        .fillMaxHeight(),
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = 90f)
                            .offset (x = 1.dp, y = 2.dp),
                            text="4",
                        )
                    }
                }
              }
              Column(modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
              ){
                Row(modifier = Modifier
                    .border(width= 2.dp, color = Color.Black, shape = RoundedCornerShape(size = 5.dp))
                    .height(40.dp)
                    .width(62.5.dp)
                    .background(Color.White, shape = RoundedCornerShape(size = 5.dp))
                ){
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.BottomStart
                    )
                    {
                        Text(modifier = Modifier
                            .rotate(degrees = -90f)
                            .offset (x = 4.dp, y = 4.dp),
                            text="4  ",
                            color = Color.Red
                        )
                    }
                    Box(modifier = Modifier.weight(2f)
                        .fillMaxHeight(),

                        )
                    {
                        Text(modifier = Modifier
                            .rotate(degrees = 90f)
                            .offset (x = 8.dp, y = -2.dp),
                            text="♥\uFE0E" +
                                    "♥\uFE0E",
                            color = Color.Red
                        )
                    }
                    Box(modifier= Modifier.weight(2f)
                        .fillMaxHeight(),
                    )
                    {
                        Text(modifier = Modifier
                            .rotate(degrees = 90f)
                            .offset (x = 8.dp, y = 3.dp),
                            text="♥\uFE0E" +
                                    "♥\uFE0E",
                            color = Color.Red
                        )
                    }
                    Box(modifier= Modifier.weight(1f)
                        .fillMaxHeight(),
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = 90f)
                            .offset (x = 1.dp, y = 2.dp),
                            text="4",
                            color = Color.Red
                        )
                    }
                }
                Row(modifier = Modifier
                    .border(width= 2.dp, color = Color.Black, shape = RoundedCornerShape(size = 5.dp))
                    .height(40.dp)
                    .width(62.5.dp)
                    .background(Color.White, shape = RoundedCornerShape(size = 5.dp))
                ){
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = -90f)
                            .offset (x = 4.dp, y = 4.dp),
                            text="3  ",
                            color = Color.Red
                        )
                    }
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = 90f)
                            .offset (x = -10.dp),
                            text="♥\uFE0E",
                            color = Color.Red
                        )
                    }
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = 90f)
                            .offset (x = -10.dp),
                            text="♥\uFE0E",
                            color = Color.Red
                        )
                    }
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.BottomStart
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = 90f)
                            .offset (x = -10.dp),
                            text="♥\uFE0E",
                            color = Color.Red
                        )
                    }
                    Box(modifier = Modifier.weight(1f)
                        .fillMaxHeight(),
                        contentAlignment = Alignment.TopStart
                    ){
                        Text(modifier = Modifier
                            .rotate(degrees = 90f)
                            .offset (y = 4.dp),
                            text="3",
                            color = Color.Red
                        )
                    }
                }
              }
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(DarkGreen)
                .padding(horizontal = 40.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    CartasDiagonal(valor = "A", palo = "♠︎", color = Color.Black, rotacion = 30f)
                    CartasDiagonal(valor = "2", palo = "♣︎", color = Color.Black, rotacion = 30f)
                }
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    CartasDiagonal(valor = "2", palo = "♥\uFE0E", color = Color.Red, rotacion = -30f)
                    CartasDiagonal(valor = "A", palo = "♣︎", color = Color.Black, rotacion = -30f)
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = DarkGreen),
                horizontalArrangement = (Arrangement.Center),
                verticalAlignment = Alignment.CenterVertically
            ){
                Column(modifier = Modifier. width(40.dp)
                    .height(62.5.dp)
                    .background(Color.White, shape = RoundedCornerShape(size = 5.dp))
                    .border(width = 2.dp, Color.Black, shape = RoundedCornerShape(size = 5.dp)),
                )
                {
                    Text(modifier = Modifier.weight(1f)
                        .align(Alignment.Start),
                        text = " A",
                        color = Color.Red
                    )
                    Text(modifier = Modifier.weight(2f)
                        .align(Alignment.CenterHorizontally)
                        .wrapContentHeight(Alignment.CenterVertically)
                        .offset(y = (-3).dp),
                        text = "♦\uFE0E",
                        color = Color.Red,
                        fontSize = 28.sp

                    )
                    Text(modifier = Modifier.weight(1f)
                        .align(Alignment.End)
                        .rotate(180f) ,
                        text = " A",
                        color = Color.Red
                    )
                }
                Column(modifier = Modifier. width(40.dp)
                    .height(62.5.dp)
                    .background(Color.White, shape = RoundedCornerShape(size = 5.dp))
                    .border(width = 2.dp, Color.Black, shape = RoundedCornerShape(size = 5.dp))
                )
                {
                    Text(modifier = Modifier.weight(1f)
                        .align(Alignment.Start),
                        text = " 2",
                        color = Color.Red
                    )
                    Text(modifier = Modifier.weight(1f)
                        .align(Alignment.CenterHorizontally)
                        .wrapContentHeight(Alignment.CenterVertically),
                        text = "♦\uFE0E",
                        color = Color.Red,
                        fontSize = 14.sp

                    )
                    Text(modifier = Modifier.weight(1f)
                        .align(Alignment.CenterHorizontally)
                        .wrapContentHeight(Alignment.CenterVertically),
                        text = "♦\uFE0E",
                        color = Color.Red,
                        fontSize = 14.sp

                    )
                    Text(modifier = Modifier.weight(1f)
                        .align(Alignment.End)
                        .rotate(180f) ,
                        text = " 2",
                        color = Color.Red
                    )
                }

            }


        }

    }

}

/**
 * Carta como objeto: fondo, borde y contenido se rotan juntos
 * porque `rotate` se aplica al contenedor completo.
 */
@Composable
fun CartasDiagonal(
    valor: String,
    palo: String,
    color: Color,
    rotacion: Float = 0f,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .rotate(rotacion)
            .width(40.dp)
            .height(62.5.dp)
            .background(Color.White, shape = RoundedCornerShape(size = 5.dp))
            .border(width = 2.dp, Color.Black, shape = RoundedCornerShape(size = 5.dp))
    ) {
        Text(
            modifier = Modifier.weight(1f).align(Alignment.Start),
            text = " $valor",
            color = color
        )
        Text(
            modifier = Modifier
                .weight(2f)
                .align(Alignment.CenterHorizontally)
                .wrapContentHeight(Alignment.CenterVertically)
                .offset(y = (-3).dp),
            text = if (valor == "2") "$palo\n$palo" else palo,
            color = color,
            fontSize = if (valor == "2") 14.sp else 26.sp,
            lineHeight = if (valor == "2") 14.sp else TextUnit.Unspecified,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier.weight(1f).align(Alignment.End).rotate(180f),
            text = "$valor ",
            color = color
        )
    }
}
