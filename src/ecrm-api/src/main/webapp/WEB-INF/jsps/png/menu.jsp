<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page import="com.maven.utils.AESUtil"%>
<c:set var="ctx" value="<%=request.getContextPath()%>" />
<c:set var="statics" value="${ctx}/static"></c:set>
<%@ page language="java" pageEncoding="UTF-8"%>

<%

%>

<div class="top">
    <div class="top_cen">
      <div class="logo"><img src="${statics }/png/images/logo.png"></div>
      <div class="nav_l">
         <ul>
		    <li>
               <a href="${ctx}/pnggame/index?stype=<%=AESUtil.encrypt("最新游戏") %>" class="col">
               <c:if test="${stype == '最新游戏' }"><b>最新游戏</b></c:if>
               <c:if test="${stype != '最新游戏' }">最新游戏</c:if>
               </a>
            </li>
            <li>
               <a href="${ctx}/pnggame/index?stype=<%=AESUtil.encrypt("桌面游戏") %>" class="col">
               <c:if test="${stype == '桌面游戏' }"><b>桌面游戏</b></c:if>
               <c:if test="${stype != '桌面游戏' }">桌面游戏</c:if>
               </a>
            </li>
            <li>
               <a href="${ctx}/pnggame/index?stype=<%=AESUtil.encrypt("视频扑克") %>" class="col">
               <c:if test="${stype == '视频扑克' }"><b>视频扑克</b></c:if>
               <c:if test="${stype != '视频扑克' }">视频扑克</c:if>
               </a>
            </li>
            <li>
               <a href="${ctx}/pnggame/index?stype=<%=AESUtil.encrypt("热门游戏") %>" class="col">
               <c:if test="${stype == '热门游戏' }"><b>热门游戏</b></c:if>
               <c:if test="${stype != '热门游戏' }">热门游戏</c:if>
               </a>
            </li>
            <li>
               <a href="${ctx}/pnggame/index?stype=<%=AESUtil.encrypt("多线游戏") %>" class="col">
			   <c:if test="${stype == '多线游戏' }"><b>多线游戏</b></c:if>
               <c:if test="${stype != '多线游戏' }">多线游戏</c:if>	
			   </a>
            </li>
            
         </ul> 
      </div>
       <div class="nav_r">
          <ul>
             <li class="l_china">
                <a href="#">CN</a>
             </li>
             <li class="l_english"><a href="#">EN</a></li>
             
          </ul>
       </div>
      
      
    </div>
</div>