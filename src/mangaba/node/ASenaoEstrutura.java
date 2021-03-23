/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class ASenaoEstrutura extends PSenaoEstrutura
{
    private PSeStant _seStant_;
    private PSenaoStant _senaoStant_;

    public ASenaoEstrutura()
    {
        // Constructor
    }

    public ASenaoEstrutura(
        @SuppressWarnings("hiding") PSeStant _seStant_,
        @SuppressWarnings("hiding") PSenaoStant _senaoStant_)
    {
        // Constructor
        setSeStant(_seStant_);

        setSenaoStant(_senaoStant_);

    }

    @Override
    public Object clone()
    {
        return new ASenaoEstrutura(
            cloneNode(this._seStant_),
            cloneNode(this._senaoStant_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASenaoEstrutura(this);
    }

    public PSeStant getSeStant()
    {
        return this._seStant_;
    }

    public void setSeStant(PSeStant node)
    {
        if(this._seStant_ != null)
        {
            this._seStant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seStant_ = node;
    }

    public PSenaoStant getSenaoStant()
    {
        return this._senaoStant_;
    }

    public void setSenaoStant(PSenaoStant node)
    {
        if(this._senaoStant_ != null)
        {
            this._senaoStant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._senaoStant_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._seStant_)
            + toString(this._senaoStant_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._seStant_ == child)
        {
            this._seStant_ = null;
            return;
        }

        if(this._senaoStant_ == child)
        {
            this._senaoStant_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._seStant_ == oldChild)
        {
            setSeStant((PSeStant) newChild);
            return;
        }

        if(this._senaoStant_ == oldChild)
        {
            setSenaoStant((PSenaoStant) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
