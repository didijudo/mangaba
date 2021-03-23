/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.parser;

import mangaba.node.*;
import mangaba.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTApos(@SuppressWarnings("unused") TApos node)
    {
        this.index = 0;
    }

    @Override
    public void caseTInteiro(@SuppressWarnings("unused") TInteiro node)
    {
        this.index = 1;
    }

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 2;
    }

    @Override
    public void caseTCaractere(@SuppressWarnings("unused") TCaractere node)
    {
        this.index = 3;
    }

    @Override
    public void caseTBooleano(@SuppressWarnings("unused") TBooleano node)
    {
        this.index = 4;
    }

    @Override
    public void caseTInicio(@SuppressWarnings("unused") TInicio node)
    {
        this.index = 5;
    }

    @Override
    public void caseTFim(@SuppressWarnings("unused") TFim node)
    {
        this.index = 6;
    }

    @Override
    public void caseTNReal(@SuppressWarnings("unused") TNReal node)
    {
        this.index = 7;
    }

    @Override
    public void caseTNInteiro(@SuppressWarnings("unused") TNInteiro node)
    {
        this.index = 8;
    }

    @Override
    public void caseTNCaract(@SuppressWarnings("unused") TNCaract node)
    {
        this.index = 9;
    }

    @Override
    public void caseTNBooleano(@SuppressWarnings("unused") TNBooleano node)
    {
        this.index = 10;
    }

    @Override
    public void caseTVerdadeiro(@SuppressWarnings("unused") TVerdadeiro node)
    {
        this.index = 11;
    }

    @Override
    public void caseTFalso(@SuppressWarnings("unused") TFalso node)
    {
        this.index = 12;
    }

    @Override
    public void caseTVetor(@SuppressWarnings("unused") TVetor node)
    {
        this.index = 13;
    }

    @Override
    public void caseTVazio(@SuppressWarnings("unused") TVazio node)
    {
        this.index = 14;
    }

    @Override
    public void caseTExibir(@SuppressWarnings("unused") TExibir node)
    {
        this.index = 15;
    }

    @Override
    public void caseTRetorne(@SuppressWarnings("unused") TRetorne node)
    {
        this.index = 16;
    }

    @Override
    public void caseTEm(@SuppressWarnings("unused") TEm node)
    {
        this.index = 17;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 18;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 19;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 20;
    }

    @Override
    public void caseTPara(@SuppressWarnings("unused") TPara node)
    {
        this.index = 21;
    }

    @Override
    public void caseTParacada(@SuppressWarnings("unused") TParacada node)
    {
        this.index = 22;
    }

    @Override
    public void caseTOctal(@SuppressWarnings("unused") TOctal node)
    {
        this.index = 23;
    }

    @Override
    public void caseTHexaDecimal(@SuppressWarnings("unused") THexaDecimal node)
    {
        this.index = 24;
    }

    @Override
    public void caseTDecimal(@SuppressWarnings("unused") TDecimal node)
    {
        this.index = 25;
    }

    @Override
    public void caseTE(@SuppressWarnings("unused") TE node)
    {
        this.index = 26;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 27;
    }

    @Override
    public void caseTNega(@SuppressWarnings("unused") TNega node)
    {
        this.index = 28;
    }

    @Override
    public void caseTIdentificador(@SuppressWarnings("unused") TIdentificador node)
    {
        this.index = 29;
    }

    @Override
    public void caseTMais(@SuppressWarnings("unused") TMais node)
    {
        this.index = 30;
    }

    @Override
    public void caseTMenos(@SuppressWarnings("unused") TMenos node)
    {
        this.index = 31;
    }

    @Override
    public void caseTMultiplica(@SuppressWarnings("unused") TMultiplica node)
    {
        this.index = 32;
    }

    @Override
    public void caseTDivisor(@SuppressWarnings("unused") TDivisor node)
    {
        this.index = 33;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 34;
    }

    @Override
    public void caseTMenorq(@SuppressWarnings("unused") TMenorq node)
    {
        this.index = 35;
    }

    @Override
    public void caseTMaiorq(@SuppressWarnings("unused") TMaiorq node)
    {
        this.index = 36;
    }

    @Override
    public void caseTIgual(@SuppressWarnings("unused") TIgual node)
    {
        this.index = 37;
    }

    @Override
    public void caseTMenorIgual(@SuppressWarnings("unused") TMenorIgual node)
    {
        this.index = 38;
    }

    @Override
    public void caseTMaiorIgual(@SuppressWarnings("unused") TMaiorIgual node)
    {
        this.index = 39;
    }

    @Override
    public void caseTEsquerdoParenteses(@SuppressWarnings("unused") TEsquerdoParenteses node)
    {
        this.index = 40;
    }

    @Override
    public void caseTDireitoParenteses(@SuppressWarnings("unused") TDireitoParenteses node)
    {
        this.index = 41;
    }

    @Override
    public void caseTAtribui(@SuppressWarnings("unused") TAtribui node)
    {
        this.index = 42;
    }

    @Override
    public void caseTPontoVirgula(@SuppressWarnings("unused") TPontoVirgula node)
    {
        this.index = 43;
    }

    @Override
    public void caseTColcheteEsquerdo(@SuppressWarnings("unused") TColcheteEsquerdo node)
    {
        this.index = 44;
    }

    @Override
    public void caseTColcheteDireito(@SuppressWarnings("unused") TColcheteDireito node)
    {
        this.index = 45;
    }

    @Override
    public void caseTChaveEsquerdo(@SuppressWarnings("unused") TChaveEsquerdo node)
    {
        this.index = 46;
    }

    @Override
    public void caseTChaveDireito(@SuppressWarnings("unused") TChaveDireito node)
    {
        this.index = 47;
    }

    @Override
    public void caseTDoisPontos(@SuppressWarnings("unused") TDoisPontos node)
    {
        this.index = 48;
    }

    @Override
    public void caseTAspas(@SuppressWarnings("unused") TAspas node)
    {
        this.index = 49;
    }

    @Override
    public void caseTSeparator(@SuppressWarnings("unused") TSeparator node)
    {
        this.index = 50;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 51;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 52;
    }
}
