package com.example.tabletdrawing

import android.graphics.Path
import android.graphics.PointF

class SerializablePath: Path() {

    private var pathList = ArrayList<PointF>()

    override fun moveTo(x: Float, y: Float) {
        pathList.add(PointF(x, y))
        super.moveTo(x, y)
    }

    override fun lineTo(x: Float, y: Float) {
        pathList.add(PointF(x, y))
        super.lineTo(x, y)
    }

    fun getPathList() = pathList
}