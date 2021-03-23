/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class ASeComando extends PComando
{
    private PSeEstrutura _seEstrutura_;

    public ASeComando()
    {
        // Constructor
    }

    public ASeComando(
        @SuppressWarnings("hiding") PSeEstrutura _seEstrutura_)
    {
        // Constructor
        setSeEstrutura(_seEstrutura_);

    }

    @Override
    public Object clone()
    {
        return new ASeComando(
            cloneNode(this._seEstrutura_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeComando(this);
    }

    public PSeEstrutura getSeEstrutura()
    {
        return this._seEstrutura_;
    }

    public void setSeEstrutura(PSeEstrutura node)
    {
        if(this._seEstrutura_ != null)
        {
            this._seEstrutura_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seEstrutura_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._seEstrutura_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._seEstrutura_ == child)
        {
            this._seEstrutura_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._seEstrutura_ == oldChild)
        {
            setSeEstrutura((PSeEstrutura) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}