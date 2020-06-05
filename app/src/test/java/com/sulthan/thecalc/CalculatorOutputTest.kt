package com.sulthan.thecalc

import com.sulthan.thecalc.calculatoroutput.CalculatorOutputInterfaceView
import com.sulthan.thecalc.calculatoroutput.CalculatorOutputPresenter
import org.junit.Test
import org.mockito.BDDMockito.then
import org.mockito.Mockito

class CalculatorOutputTest {

    private val mmPresenter = CalculatorOutputPresenter
    private val mmMockView = Mockito.mock(CalculatorOutputInterfaceView::class.java)

    @Test
    fun `1 plus 1 is 2`() {

        //Given that the view is attached
        mmPresenter.attach(mmMockView)

        //When a number is added
        mmPresenter.add("1")

        //Then the correct equation should be set
        then(mmMockView).should().setEquation("1")

        //When a operator is added
        mmPresenter.add("+")

        //Then the correct equation should be set
        then(mmMockView).should().setEquation("1+")

        //When a number is added
        mmPresenter.add("1")

        //Then the correct equation should be set
        then(mmMockView).should().setEquation("1+1")

        //Then the correct outcome should be set
        then(mmMockView).should().setOutcome("2")

        //Clear presenter
        mmPresenter.clear()
    }

    @Test
    fun `2 plus 2 is 4`() {

        //Given that the view is attached
        mmPresenter.attach(mmMockView)

        //When a number is added
        mmPresenter.add("2")

        //Then the correct equation should be set
        then(mmMockView).should().setEquation("2")

        //When a operator is added
        mmPresenter.add("+")

        //Then the correct equation should be set
        then(mmMockView).should().setEquation("2+")

        //When a number is added
        mmPresenter.add("2")

        //Then the correct equation should be set
        then(mmMockView).should().setEquation("2+2")

        //Then the correct outcome should be set
        then(mmMockView).should().setOutcome("4")

        //Clear presenter
        mmPresenter.clear()
    }

}