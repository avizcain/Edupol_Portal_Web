$(document).ready(function(){

  if ( $(".slideshow").length ) {
    $(".slideshow").cycle();
  }
  

  if ( $(".isotope").length ) {
    var $container = $('.isotope'),
    $select = $('.header-isotope select');
    filters = {};

    $container.imagesLoaded(function(){
      $container.isotope({
        itemSelector: '.item'
      });
      moveInner();
    });

    $select.change(function() {
    var $this = $(this);

    var $optionSet = $this;
    var group = $optionSet.attr('data-filter-group');
    filters[group] = $this.find('option:selected').attr('data-filter');

    var isoFilters = [];
    for (var prop in filters) {
    isoFilters.push(filters[prop])
    }
    var selector = isoFilters.join('');

    $container.isotope({
    filter: selector
    });

    return false;
    });

    function moveInner() {
      var imagew = $(".isotope .item figure img").width();
      var imageh = $(".isotope .item figure img").height();
      var innerh = $(".isotope .item .inner").height();
      $(".isotope .item").each(function(){
        $(this).find(".inner").css("padding-top", (imageh/2 - innerh/2)+"px");
      })
    }

    

    $(window).resize(function(){
      $(".isotope").isotope('reLayout');
      moveInner();
    })
  }

  if ( $(".selectpicker").length ) {
    $(".selectpicker").selectpicker();
  }

  

  $("a.prettyphoto").prettyPhoto({theme: 'dark_square'});


  if ($(".widget-accordion").length) {

    $(".widget-accordion .item .toggle").click(function(){

      var item = $(this).parent();
      var pane = item.find(".data .inner");

      if ( item.hasClass("active") ) {
        pane.slideUp(function(){
          item.removeClass("active");
        });
      }
      else {
        pane.slideDown(function(){
          item.addClass("active");
        });

        item.prevAll(".item.active").find(".data .inner").slideUp(function(){ $(this).closest(".item").removeClass("active"); });
        item.nextAll(".item.active").find(".data .inner").slideUp(function(){ $(this).closest(".item").removeClass("active"); });
      }

    });

  }

  $("#top .nav > li").each(function(){
    $(this).append("<div class='line' />");
  })

      //custom scroll to anchor function
    $(".top").click(function() {
        $.scrollTo($($(this).attr("href")), {
            duration: 750,
            easing: "easeInOutExpo"
        });
        return false;
    });

    setTimeout(function(){

        $('.progress .bar').each(function() {
            var me = $(this).find("span");
            var perc = me.parent().parent().attr("data-percentage");

            //TODO: left and right text handling

            var current_perc = 0;

            var progress = setInterval(function() {
                if (current_perc>=perc) {
                    clearInterval(progress);
                } else {
                    current_perc +=2;
                    me.parent().parent().css('width', (current_perc)+'%');
                }

                me.text((current_perc)+'%');

            }, 50);

        });

    },300);

  if ( $("#contact-form").length ) {
    //contact form init
    var options = {target: "#alert"};
    $("#contact-form").ajaxForm(options);
  }

  function drops() {
    var screen_width = $(window).width();
    if ( screen_width > 1033 ) {
      $(".dropdown").mouseenter(function(){
        $(this).addClass("open");
      });
      $(".dropdown").mouseleave(function(){
        $(this).removeClass("open");
      });
      $(".dropdown > .dropdown-menu > li.stack").mouseenter(function(){
        $(this).addClass("open");
      });
      $(".dropdown > .dropdown-menu > li.stack").mouseleave(function(){
        $(this).removeClass("open");
      });
    }

    if ( screen_width < 1033 ) {
      $(".dropdown").unbind("mouseenter mouseleave");
      $(".dropdown-menu li.stack").unbind("mouseenter mouseleave");

     $(".dropdown").click(function(){
      $(this).find("li.stack").removeClass("open");
     });

     $("html").click(function(){
      $(".dropdown li.stack").removeClass("open");
     });

     $(".dropdown > .dropdown-menu > li.stack > a").click(function(){
        $(this).parent().addClass("open");
        return false;
     });

    }
  }

  drops();
  
  $("ul").mouseover(function(){
      drops();
  });

  $(window).resize(function(){
    drops();
  });
  
});
