/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoEstrutura extends PEnquantoEstrutura
{
    private PEnquantoStant _enquantoStant_;

    public AEnquantoEstrutura()
    {
        // Constructor
    }

    public AEnquantoEstrutura(
        @SuppressWarnings("hiding") PEnquantoStant _enquantoStant_)
    {
        // Constructor
        setEnquantoStant(_enquantoStant_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoEstrutura(
            cloneNode(this._enquantoStant_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoEstrutura(this);
    }

    public PEnquantoStant getEnquantoStant()
    {
        return this._enquantoStant_;
    }

    public void setEnquantoStant(PEnquantoStant node)
    {
        if(this._enquantoStant_ != null)
        {
            this._enquantoStant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enquantoStant_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._enquantoStant_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enquantoStant_ == child)
        {
            this._enquantoStant_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._enquantoStant_ == oldChild)
        {
            setEnquantoStant((PEnquantoStant) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
