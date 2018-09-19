using System;

namespace Calculator_CSharp.Models
{
    public class Calculator
    {
        public Calculator()
        {
            this.Result = 0;
        }

        public decimal LeftOperand { get; set; }
        public decimal RightOperand { get; set; }
        public string Operator { get; set; }
        public decimal Result { get; set; }

        public void CalculateResult()
        {
            var resultDouble = 0.00;

            switch (this.Operator)
            {
                case "+": this.Result = this.LeftOperand + this.RightOperand; break;
                case "-": this.Result = this.LeftOperand - this.RightOperand; break;
                case "*": this.Result = this.LeftOperand * this.RightOperand; break;
                case "/": this.Result = this.LeftOperand / this.RightOperand; break;
                case "^": resultDouble = Math.Pow((double)this.LeftOperand, (double)this.RightOperand); this.Result = (decimal)resultDouble; break;
                case "√": resultDouble = Math.Sqrt((double)this.LeftOperand); this.Result = (decimal)resultDouble; break;
                case "Mod": this.Result = this.LeftOperand % this.RightOperand; break;
                default: this.Result = 0; break;
            }
        }
    }
}
