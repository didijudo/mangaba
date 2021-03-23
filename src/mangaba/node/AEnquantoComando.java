/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoComando extends PComando
{
    private PEnquantoEstrutura _enquantoEstrutura_;

    public AEnquantoComando()
    {
        // Constructor
    }

    public AEnquantoComando(
        @SuppressWarnings("hiding") PEnquantoEstrutura _enquantoEstrutura_)
    {
        // Constructor
        setEnquantoEstrutura(_enquantoEstrutura_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoComando(
            cloneNode(this._enquantoEstrutura_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoComando(this);
    }

    public PEnquantoEstrutura getEnquantoEstrutura()
    {
        return this._enquantoEstrutura_;
    }

    public void setEnquantoEstrutura(PEnquantoEstrutura node)
    {
        if(this._enquantoEstrutura_ != null)
        {
            this._enquantoEstrutura_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enquantoEstrutura_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._enquantoEstrutura_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enquantoEstrutura_ == child)
        {
            this._enquantoEstrutura_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._enquantoEstrutura_ == oldChild)
        {
            setEnquantoEstrutura((PEnquantoEstrutura) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
