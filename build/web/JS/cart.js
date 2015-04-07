/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var counter=0;
var cart_up=document.getElementById("cartup");

function start()
{
    var s=document.getElementById('email');
    var t=s.innerHTML;
    if(t.indexOf("@")>0)
        alert("success");
    else
        alert("false");

}

var treeSelected = null;//选中的树节点
var imgPlus = new Image();
imgPlus.src="./images/treenodeplus.gif";
var imgMinus = new Image();
imgMinus.src="./images/treenodeminus.gif";

function expandCollapse(el)
{
    
    if (el.className!== "treeNode"){
        return;    
    }    
    var child;
    var imgEl;
    for(var i=0; i < el.childNodes.length; i++)
    {
        child = el.childNodes[i];
        if (child.src)
        {
            imgEl = child;
        }
        else if (child.className === "treeSubnodesHidden")
        {
            child.className = "treeSubnodes";
            imgEl.src = imgMinus.src;
            break;
        }
        else if (child.className === "treeSubnodes")
        {
            child.className = "treeSubnodesHidden";
            imgEl.src = imgPlus.src;
            break;
        }
    }
}


function clickAnchor(el)
{
    selectNode(el.parentNode);
    el.blur();
}

function selectNode(el)
{
    if (treeSelected !== null)
    {
        setSubNodeClass(treeSelected, 'A', 'treeUnselected');
    }
    setSubNodeClass(el, 'A', 'treeSelected');
    treeSelected = el;
}

function setSubNodeClass(el, nodeName, className)
{
    var child;
    for (var i=0; i < el.childNodes.length; i++)
    {
        child = el.childNodes[i];
        if (child.nodeName === nodeName)
        {
            child.className = className;
            break;
        }
    }
}


