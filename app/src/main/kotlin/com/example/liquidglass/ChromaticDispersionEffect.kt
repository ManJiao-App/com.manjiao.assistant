/**
 * 色散效果（内置精简版）
 *
 * 原库此文件依赖 JNI native 色散实现；内置版去除 JNI 后此效果退化为直通，
 * 保持模糊/折射主路径可用。透镜管线（AGSL）自带 GPU 色散不受影响。
 */
package com.example.liquidglass

import android.graphics.Bitmap

class ChromaticDispersionEffect {

    fun apply(
        source: Bitmap,
        refThickness: Float = 100f,
        refFactor: Float = 1.5f,
        refDispersion: Float = 7f,
        downscale: Float = 0.5f,
        cornerRadius: Float = 0f,
        useNormalMap: Boolean = false,
        cornerRadii: FloatArray? = null
    ): Bitmap {
        return source
    }

    fun applyPreset(source: Bitmap, preset: String): Bitmap = source

    fun clearCache() {}

    fun getRecommendedDownscale(width: Int, height: Int): Float {
        return when {
            width * height > 800 * 800 -> 0.35f
            width * height > 400 * 400 -> 0.5f
            else -> 0.65f
        }
    }
}
