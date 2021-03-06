/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class ARetorneComando extends PComando
{
    private PRetorno _retorno_;

    public ARetorneComando()
    {
        // Constructor
    }

    public ARetorneComando(
        @SuppressWarnings("hiding") PRetorno _retorno_)
    {
        // Constructor
        setRetorno(_retorno_);

    }

    @Override
    public Object clone()
    {
        return new ARetorneComando(
            cloneNode(this._retorno_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARetorneComando(this);
    }

    public PRetorno getRetorno()
    {
        return this._retorno_;
    }

    public void setRetorno(PRetorno node)
    {
        if(this._retorno_ != null)
        {
            this._retorno_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._retorno_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._retorno_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._retorno_ == child)
        {
            this._retorno_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._retorno_ == oldChild)
        {
            setRetorno((PRetorno) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
