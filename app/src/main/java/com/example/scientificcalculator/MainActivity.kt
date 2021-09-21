package com.example.scientificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

lateinit var primaryTV : TextView
lateinit var secondaryTV: TextView
lateinit var ac_button: Button
lateinit var c_button: Button
lateinit var brac1_button: Button
lateinit var brac2_button: Button
lateinit var sin_button: Button
lateinit var cos_button: Button
lateinit var tan_button: Button
lateinit var log_button: Button
lateinit var ln_button: Button
lateinit var fact_button: Button
lateinit var square_button: Button
lateinit var squareroot_button: Button
lateinit var inverse_button: Button
lateinit var divide_button: Button
lateinit var num1_button: Button
lateinit var num2_button: Button
lateinit var num3_button: Button
lateinit var num4_button: Button
lateinit var num5_button: Button
lateinit var num6_button: Button
lateinit var num7_button: Button
lateinit var num8_button: Button
lateinit var num9_button: Button
lateinit var num0_button: Button
lateinit var multiply_button: Button
lateinit var subtract_button: Button
lateinit var add_button: Button
lateinit var pi_button: Button
lateinit var dot_button: Button
lateinit var equal_button: Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        primaryTV = findViewById(R.id.idTVprimary)
        secondaryTV = findViewById(R.id.idTVSecondary)
        ac_button = findViewById(R.id.bac)
        c_button = findViewById(R.id.bc)
        brac1_button = findViewById(R.id.bbrac1)
        brac2_button = findViewById(R.id.bbrac2)
        sin_button = findViewById(R.id.bsin)
        cos_button = findViewById(R.id.bcos)
        tan_button = findViewById(R.id.btan)
        log_button = findViewById(R.id.blog)
        ln_button = findViewById(R.id.bln)
        inverse_button = findViewById(R.id.binverse)
        fact_button = findViewById(R.id.bfact)
        square_button = findViewById(R.id.bsquare)
        squareroot_button = findViewById(R.id.bsquareroot)
        divide_button = findViewById(R.id.bdivide)
        num1_button = findViewById(R.id.b1)
        num2_button = findViewById(R.id.b2)
        num3_button = findViewById(R.id.b3)
        num4_button = findViewById(R.id.b4)
        num5_button = findViewById(R.id.b5)
        num6_button = findViewById(R.id.b6)
        num7_button = findViewById(R.id.b7)
        num8_button = findViewById(R.id.b8)
        num9_button = findViewById(R.id.b9)
        num0_button = findViewById(R.id.b0)
        multiply_button = findViewById(R.id.bmultiply)
        subtract_button = findViewById(R.id.bsubtract)
        add_button = findViewById(R.id.badd)
        equal_button = findViewById(R.id.bequal)
        dot_button = findViewById(R.id.bdot)
        pi_button = findViewById(R.id.bpi)

        num0_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"0")

        }
        num1_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"1")
        }
        num2_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"2")
        }
        num3_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"3")
        }
        num4_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"4")
        }
        num5_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"5")
        }
        num6_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"6")
        }
        num7_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"7")
        }
        num8_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"8")
        }
        num9_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"9")
        }
        dot_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+".")
        }
        add_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"+")
        }
        subtract_button.setOnClickListener {
            val str: String = primaryTV.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                primaryTV.text = (primaryTV.text.toString() + "-")
            }
        }
        multiply_button.setOnClickListener {
            val str: String = primaryTV.text.toString()
            if (!str.get(index = str.length - 1).equals("*")) {
                primaryTV.text = (primaryTV.text.toString() + "*")
            }
        }
        divide_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"/")
        }
        brac1_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"(")
        }
        brac2_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+")")
        }
        pi_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"3.142")
            secondaryTV.text = (pi_button.text.toString())

        }
        sin_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"sin")
        }
        cos_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"cos")
        }
        tan_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"tan")
        }
        inverse_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"^" + "(-1)")
        }
        log_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"log")
        }
        ln_button.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString()+"ln")
        }
        squareroot_button.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {

                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = primaryTV.text.toString()

                val r = Math.sqrt(str.toDouble())

                val result = r.toString()
                primaryTV.setText(result)
            }
        }
        equal_button.setOnClickListener {
            val str: String = primaryTV.text.toString()

            val result: Double = evaluate(str)

            val r = result.toString()
            primaryTV.setText(r)
            secondaryTV.text = str
        }
        ac_button.setOnClickListener {

            primaryTV.setText("")
            secondaryTV.setText("")
        }
        c_button.setOnClickListener {

            var str: String = primaryTV.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                primaryTV.text = str
            }
        }
        square_button.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {

                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {

                val d: Double = primaryTV.getText().toString().toDouble()

                val square = d * d

                primaryTV.setText(square.toString())

                secondaryTV.text = "$d²"
            }
        }
        fact_button.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {

                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {

                val value: Int = primaryTV.text.toString().toInt()
                val fact: Int = factorial(value)
                primaryTV.setText(fact.toString())
                secondaryTV.text = "$value`!"
            }

        }









    }
    fun factorial(n: Int): Int {

        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

    fun evaluate(str: String): Double {
        return object : Any() {

            var pos = -1
            var ch = 0


            fun nextChar() {

                ch = if (++pos < str.length) str[pos].toInt() else -1
            }


            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.toInt()) nextChar()

                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }


            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }


            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.toInt())) x += parseTerm()
                    else if (eat('-'.toInt())) x -= parseTerm()
                    else return x
                }
            }


            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.toInt())) x *= parseFactor()
                    else if (eat('/'.toInt())) x /= parseFactor()
                    else return x
                }
            }


            fun parseFactor(): Double {

                if (eat('+'.toInt())) return parseFactor() // unary plus
                if (eat('-'.toInt())) return -parseFactor() // unary minus

                var x: Double

                val startPos = pos

                if (eat('('.toInt())) {
                    x = parseExpression()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {

                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()

                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {

                    while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                    val func = str.substring(startPos, pos)

                    x = parseFactor()

                    x =
                        if (func == "sqrt") Math.sqrt(x)

                        else if (func == "sin") Math.sin(
                            Math.toRadians(x)

                        ) else if (func == "cos") Math.cos(
                            Math.toRadians(x)

                        ) else if (func == "tan")
                            Math.tan(Math.toRadians(x))

                        else if (func == "log")
                            Math.log10(x)

                        else if (func == "ln") Math.log(x)

                        else throw RuntimeException(
                            "Unknown function: $func"
                        )
                } else {

                    throw RuntimeException("Unexpected: " + ch.toChar())
                }

                if (eat('^'.toInt())) x = Math.pow(x, parseFactor())
                return x
            }

        }.parse()
    }
}