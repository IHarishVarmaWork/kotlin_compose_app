package com.android.dev.engineer.kotlin.compose.ui.composable

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.dev.engineer.kotlin.compose.ui.theme.KotlinComposeAppTheme
import com.android.ide.common.rendering.api.SessionParams
import org.junit.Rule
import org.junit.Test

class TextButtonComposableTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.NEXUS_5.copy(softButtons = false),
        renderingMode = SessionParams.RenderingMode.SHRINK
    )

    @Test
    fun testScreenshotTextButtonComposable() {
        paparazzi.snapshot {
            KotlinComposeAppTheme {
                TextButtonComposable(
                    text = "Skip",
                    onClick = {}
                )
            }
        }
    }
}