package com.chimy.iglogincompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen() {
    Box(Modifier.fillMaxSize().padding(8.dp)) {
        Header(Modifier.align(Alignment.TopEnd))

    }
}

@Composable
fun Header(modifier: Modifier) {
    Icon(imageVector = Icons.Default.Close, contentDescription = "close app", modifier = modifier)
}