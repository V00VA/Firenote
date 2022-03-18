package ru.tech.firenote.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

val NoteYellow = Color(0xFFFFF389)
val NotePink = Color(0xFFE2648C)
val NoteRed = Color(0xFFE76A6A)
val NoteBlue = Color(0xFF81DBDF)
val NoteOrange = Color(0xFFE68049)
val NoteMint = Color(0xFF3ECC89)
val NoteViolet = Color(0xFFF0A2FF)
val NoteIndigo = Color(0xFFA7ABE9)
val NoteGreen = Color(0xFF8DDF69)

val GoalGreen = Color(0xFF92CC77)
val GoalCarrot = Color(0xFFBB7C5A)
val GoalRed = Color(0xFFD57171)

val noteColors =
    listOf(
        NoteYellow,
        NoteGreen,
        NoteMint,
        NoteBlue,
        NoteIndigo,
        NoteViolet,
        NoteOrange,
        NoteRed,
        NotePink
    )

val goalColors =
    listOf(
        GoalGreen,
        GoalCarrot,
        GoalRed
    )

val Int.priority
    get() = when (this) {
        NoteYellow.toArgb() -> 0
        NoteGreen.toArgb() -> 1
        NoteMint.toArgb() -> 2
        NoteBlue.toArgb() -> 3
        NoteIndigo.toArgb() -> 4
        NoteViolet.toArgb() -> 5
        NoteOrange.toArgb() -> 6
        NoteRed.toArgb() -> 7
        else -> 8
    }

val md_theme_light_primary = Color(0xFF984065)
val md_theme_light_onPrimary = Color(0xFFffffff)
val md_theme_light_primaryContainer = Color(0xFFffd8e5)
val md_theme_light_onPrimaryContainer = Color(0xFF3e001f)
val md_theme_light_secondary = Color(0xFF735760)
val md_theme_light_onSecondary = Color(0xFFffffff)
val md_theme_light_secondaryContainer = Color(0xFFffd8e3)
val md_theme_light_onSecondaryContainer = Color(0xFF2b151d)
val md_theme_light_tertiary = Color(0xFF7d5636)
val md_theme_light_onTertiary = Color(0xFFffffff)
val md_theme_light_tertiaryContainer = Color(0xFFffdcc1)
val md_theme_light_onTertiaryContainer = Color(0xFF2f1500)
val md_theme_light_error = Color(0xFFba1b1b)
val md_theme_light_errorContainer = Color(0xFFffdad4)
val md_theme_light_onError = Color(0xFFffffff)
val md_theme_light_onErrorContainer = Color(0xFF410001)
val md_theme_light_background = Color(0xFFfcfcfc)
val md_theme_light_onBackground = Color(0xFF1f1a1b)
val md_theme_light_surface = Color(0xFFfcfcfc)
val md_theme_light_onSurface = Color(0xFF1f1a1b)
val md_theme_light_surfaceVariant = Color(0xFFf2dde2)
val md_theme_light_onSurfaceVariant = Color(0xFF514347)
val md_theme_light_outline = Color(0xFF827377)
val md_theme_light_inverseOnSurface = Color(0xFFfaeef0)
val md_theme_light_inverseSurface = Color(0xFF352f30)
val md_theme_light_inversePrimary = Color(0xFFffb0cd)

val md_theme_dark_primary = Color(0xFFffb0cd)
val md_theme_dark_onPrimary = Color(0xFF5d1136)
val md_theme_dark_primaryContainer = Color(0xFF7a294d)
val md_theme_dark_onPrimaryContainer = Color(0xFFffd8e5)
val md_theme_dark_secondary = Color(0xFFe1bdc7)
val md_theme_dark_onSecondary = Color(0xFF422932)
val md_theme_dark_secondaryContainer = Color(0xFF5a3f48)
val md_theme_dark_onSecondaryContainer = Color(0xFFffd8e3)
val md_theme_dark_tertiary = Color(0xFFf0bc95)
val md_theme_dark_onTertiary = Color(0xFF48290d)
val md_theme_dark_tertiaryContainer = Color(0xFF623f21)
val md_theme_dark_onTertiaryContainer = Color(0xFFffdcc1)
val md_theme_dark_error = Color(0xFFffb4a9)
val md_theme_dark_errorContainer = Color(0xFF930006)
val md_theme_dark_onError = Color(0xFF680003)
val md_theme_dark_onErrorContainer = Color(0xFFffdad4)
val md_theme_dark_background = Color(0xFF1f1a1b)
val md_theme_dark_onBackground = Color(0xFFebdfe1)
val md_theme_dark_surface = Color(0xFF1f1a1b)
val md_theme_dark_onSurface = Color(0xFFebdfe1)
val md_theme_dark_surfaceVariant = Color(0xFF514347)
val md_theme_dark_onSurfaceVariant = Color(0xFFd5c1c6)
val md_theme_dark_outline = Color(0xFF9d8c90)
val md_theme_dark_inverseOnSurface = Color(0xFF1f1a1b)
val md_theme_dark_inverseSurface = Color(0xFFebdfe1)
val md_theme_dark_inversePrimary = Color(0xFF984065)


/* val md_theme_light_primary = Color(0xFF006e06)
val md_theme_light_onPrimary = Color(0xFFffffff)
val md_theme_light_primaryContainer = Color(0xFF6eff6a)
val md_theme_light_onPrimaryContainer = Color(0xFF002200)
val md_theme_light_secondary = Color(0xFF606200)
val md_theme_light_onSecondary = Color(0xFFffffff)
val md_theme_light_secondaryContainer = Color(0xFFe6e972)
val md_theme_light_onSecondaryContainer = Color(0xFF1c1d00)
val md_theme_light_tertiary = Color(0xFF006b5f)
val md_theme_light_onTertiary = Color(0xFFffffff)
val md_theme_light_tertiaryContainer = Color(0xFF75f8e4)
val md_theme_light_onTertiaryContainer = Color(0xFF00201b)
val md_theme_light_error = Color(0xFFB3261E)
val md_theme_light_errorContainer = Color(0xFFF9DEDC)
val md_theme_light_onError = Color(0xFFFFFFFF)
val md_theme_light_onErrorContainer = Color(0xFF410E0B)
val md_theme_light_background = Color(0xFFFFFBFE)
val md_theme_light_onBackground = Color(0xFF1C1B1F)
val md_theme_light_surface = Color(0xFFFFFBFE)
val md_theme_light_onSurface = Color(0xFF1C1B1F)
val md_theme_light_surfaceVariant = Color(0xFFE7E0EC)
val md_theme_light_onSurfaceVariant = Color(0xFF49454F)
val md_theme_light_outline = Color(0xFF79747E)
val md_theme_light_inverseOnSurface = Color(0xFFF4EFF4)
val md_theme_light_inverseSurface = Color(0xFF313033)
val md_theme_light_inversePrimary = Color(0xFF00e620)

val md_theme_dark_primary = Color(0xFF00e620)
val md_theme_dark_onPrimary = Color(0xFF003a01)
val md_theme_dark_primaryContainer = Color(0xFF005303)
val md_theme_dark_onPrimaryContainer = Color(0xFF6eff6a)
val md_theme_dark_secondary = Color(0xFFcacd59)
val md_theme_dark_onSecondary = Color(0xFF313300)
val md_theme_dark_secondaryContainer = Color(0xFF474a00)
val md_theme_dark_onSecondaryContainer = Color(0xFFe6e972)
val md_theme_dark_tertiary = Color(0xFF54dbc8)
val md_theme_dark_onTertiary = Color(0xFF003730)
val md_theme_dark_tertiaryContainer = Color(0xFF005046)
val md_theme_dark_onTertiaryContainer = Color(0xFF75f8e4)
val md_theme_dark_error = Color(0xFFF2B8B5)
val md_theme_dark_errorContainer = Color(0xFF8C1D18)
val md_theme_dark_onError = Color(0xFF601410)
val md_theme_dark_onErrorContainer = Color(0xFFF9DEDC)
val md_theme_dark_background = Color(0xFF1C1B1F)
val md_theme_dark_onBackground = Color(0xFFE6E1E5)
val md_theme_dark_surface = Color(0xFF1C1B1F)
val md_theme_dark_onSurface = Color(0xFFE6E1E5)
val md_theme_dark_surfaceVariant = Color(0xFF49454F)
val md_theme_dark_onSurfaceVariant = Color(0xFFCAC4D0)
val md_theme_dark_outline = Color(0xFF938F99)
val md_theme_dark_inverseOnSurface = Color(0xFF1C1B1F)
val md_theme_dark_inverseSurface = Color(0xFFE6E1E5)
val md_theme_dark_inversePrimary = Color(0xFF006e06) */