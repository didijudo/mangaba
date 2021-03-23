/* This file was generated by SableCC (http://www.sablecc.org/). */

package mangaba.node;

import mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AVazioTipoFuncao extends PTipoFuncao
{
    private TVazio _vazio_;

    public AVazioTipoFuncao()
    {
        // Constructor
    }

    public AVazioTipoFuncao(
        @SuppressWarnings("hiding") TVazio _vazio_)
    {
        // Constructor
        setVazio(_vazio_);

    }

    @Override
    public Object clone()
    {
        return new AVazioTipoFuncao(
            cloneNode(this._vazio_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVazioTipoFuncao(this);
    }

    public TVazio getVazio()
    {
        return this._vazio_;
    }

    public void setVazio(TVazio node)
    {
        if(this._vazio_ != null)
        {
            this._vazio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._vazio_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._vazio_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._vazio_ == child)
        {
            this._vazio_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._vazio_ == oldChild)
        {
            setVazio((TVazio) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
