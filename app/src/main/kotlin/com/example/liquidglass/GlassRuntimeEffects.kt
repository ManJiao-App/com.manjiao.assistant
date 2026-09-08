/**
 * API 36+ AGSL 运行时效果工厂（桩）
 *
 * 原 lib 使用 compileSdk 36 编译；本项目 compileSdk 35 无法引用
 * RuntimeColorFilter / RuntimeXfermode / BAKLAVA，相关路径全部剪除。
 * 保留签名以便调用方（已全部清理）后续扩展，恒返回 null / false。
 */
package com.example.liquidglass

internal object GlassRuntimeEffects {

    val isSupported: Boolean
        get() = false
}
