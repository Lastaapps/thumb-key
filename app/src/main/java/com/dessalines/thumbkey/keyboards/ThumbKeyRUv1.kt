package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.KeyboardBackspace
import androidx.compose.material.icons.outlined.KeyboardReturn
import androidx.compose.material.icons.outlined.Numbers
import androidx.compose.material.icons.outlined.Settings
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.SwipeDirection

val THUMBKEY_RU_V1_MAIN = KeyboardC(
    arrayOf(
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("с"),
                    action = KeyAction.CommitText("с"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("й"),
                        action = KeyAction.CommitText("й")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("р"),
                    action = KeyAction.CommitText("р"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("х"),
                        action = KeyAction.CommitText("х")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("а"),
                    action = KeyAction.CommitText("а"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ж"),
                        action = KeyAction.CommitText("ж")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                    action = KeyAction.GotoSettings,
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("н"),
                    action = KeyAction.CommitText("н"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("м"),
                        action = KeyAction.CommitText("м")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("в"),
                    action = KeyAction.CommitText("в"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("я"),
                        action = KeyAction.CommitText("я")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ы"),
                        action = KeyAction.CommitText("ы")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ь"),
                        action = KeyAction.CommitText("ь")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("п"),
                        action = KeyAction.CommitText("п")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("у"),
                        action = KeyAction.CommitText("у")
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("з"),
                        action = KeyAction.CommitText("з")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("г"),
                        action = KeyAction.CommitText("г")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("к"),
                        action = KeyAction.CommitText("к")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("е"),
                    action = KeyAction.CommitText("е"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("э"),
                        action = KeyAction.CommitText("э")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("л"),
                        action = KeyAction.CommitText("л")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ф"),
                        action = KeyAction.CommitText("ф")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                        action = KeyAction.ToggleShiftMode(true),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
                    action = KeyAction.ToggleNumericMode(true),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("т"),
                    action = KeyAction.CommitText("т"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ч"),
                        action = KeyAction.CommitText("ч")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ш"),
                        action = KeyAction.CommitText("ш")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("и"),
                    action = KeyAction.CommitText("и"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("щ"),
                        action = KeyAction.CommitText("щ")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("б"),
                        action = KeyAction.CommitText("б")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ц"),
                        action = KeyAction.CommitText("ц")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("о"),
                    action = KeyAction.CommitText("о"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("д"),
                        action = KeyAction.CommitText("д")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ю"),
                        action = KeyAction.CommitText("ю")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ъ"),
                        action = KeyAction.CommitText("ъ")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ё"),
                        action = KeyAction.CommitText("ё")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardBackspace),
                    action = KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent
                                .KEYCODE_DEL
                        )
                    ),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    ),
                    SwipeDirection.TOP_LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    )
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" ")
                ),
                nextTapActions = arrayOf(
                    KeyAction.ReplaceLastText(", ", trimCount = 1),
                    KeyAction.ReplaceLastText(". "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": ")
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT,
                widthMultiplier = 3
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardReturn),
                    action = KeyAction.IMECompleteAction,
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        )
    )
)

val THUMBKEY_RU_V1_SHIFTED = KeyboardC(
    arrayOf(
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("С"),
                    action = KeyAction.CommitText("С"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Й"),
                        action = KeyAction.CommitText("Й")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("Р"),
                    action = KeyAction.CommitText("Р"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("Х"),
                        action = KeyAction.CommitText("Х")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("А"),
                    action = KeyAction.CommitText("А"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Ж"),
                        action = KeyAction.CommitText("Ж")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                    action = KeyAction.GotoSettings,
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("Н"),
                    action = KeyAction.CommitText("Н"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("М"),
                        action = KeyAction.CommitText("М")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("В"),
                    action = KeyAction.CommitText("В"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Я"),
                        action = KeyAction.CommitText("Я")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ы"),
                        action = KeyAction.CommitText("Ы")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Ь"),
                        action = KeyAction.CommitText("Ь")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("П"),
                        action = KeyAction.CommitText("П")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("У"),
                        action = KeyAction.CommitText("У")
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("З"),
                        action = KeyAction.CommitText("З")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Г"),
                        action = KeyAction.CommitText("Г")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("К"),
                        action = KeyAction.CommitText("К")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("Е"),
                    action = KeyAction.CommitText("Е"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Э"),
                        action = KeyAction.CommitText("Э")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Л"),
                        action = KeyAction.CommitText("Л")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Ф"),
                        action = KeyAction.CommitText("Ф")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                        action = KeyAction.ToggleShiftMode(false),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
                    action = KeyAction.ToggleNumericMode(true),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("Т"),
                    action = KeyAction.CommitText("Т"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Ч"),
                        action = KeyAction.CommitText("Ч")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ш"),
                        action = KeyAction.CommitText("Ш")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("И"),
                    action = KeyAction.CommitText("И"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Щ"),
                        action = KeyAction.CommitText("Щ")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Б"),
                        action = KeyAction.CommitText("Б")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Ц"),
                        action = KeyAction.CommitText("Ц")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("О"),
                    action = KeyAction.CommitText("О"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Д"),
                        action = KeyAction.CommitText("Д")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Ю"),
                        action = KeyAction.CommitText("Ю")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Ъ"),
                        action = KeyAction.CommitText("Ъ")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Ё"),
                        action = KeyAction.CommitText("Ё")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardBackspace),
                    action = KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent
                                .KEYCODE_DEL
                        )
                    ),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    ),
                    SwipeDirection.TOP_LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    )
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" ")
                ),
                nextTapActions = arrayOf(
                    KeyAction.ReplaceLastText(", ", trimCount = 1),
                    KeyAction.ReplaceLastText(". "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": ")
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT,
                widthMultiplier = 3
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardReturn),
                    action = KeyAction.IMECompleteAction,
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        )
    )
)

val THUMBKEY_RU_V1_KEYBOARD_MODES: Map<KeyboardMode, KeyboardC> = mapOf(
    KeyboardMode.MAIN to THUMBKEY_RU_V1_MAIN,
    KeyboardMode.SHIFTED to THUMBKEY_RU_V1_SHIFTED,
    KeyboardMode.NUMERIC to NUMERIC_KEYBOARD
)