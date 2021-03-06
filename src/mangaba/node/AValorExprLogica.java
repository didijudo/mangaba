/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AValorExprLogica extends PExprLogica
{
    private PValor _valor_;

    public AValorExprLogica()
    {
        // Constructor
    }

    public AValorExprLogica(
        @SuppressWarnings("hiding") PValor _valor_)
    {
        // Constructor
        setValor(_valor_);

    }

    @Override
    public Object clone()
    {
        return new AValorExprLogica(
            cloneNode(this._valor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAValorExprLogica(this);
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._valor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
